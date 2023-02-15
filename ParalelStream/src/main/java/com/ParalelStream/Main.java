package com.ParalelStream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");

        //Her işlem aynı thread'ta çalışacaktır ve hepsi senkron olarak ilerleyecektir.
        Long star = System.currentTimeMillis();
        myList.stream().forEach((str) -> {
            try {
                System.out.println(str);
                Thread.sleep(1000);
            }
            catch (Exception e) {

            }
        });
        System.out.println((System.currentTimeMillis() - star) / 1000);


        //Her işlem asenkron olarak farklı thread'ler tarafından çalışacaktır ve süre çok daha kısa olacaktır.
        Long start2 = System.currentTimeMillis();
        myList.parallelStream().forEach((str) ->{
            try {
                System.out.println(str);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println((System.currentTimeMillis() - start2) / 1000);


    }
}
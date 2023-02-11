package com.JavaCoreExample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("a");
        setString.add("a");
        System.out.println(setString.size());

        HashSet<String> hashSetString = new HashSet<>();
        hashSetString.add("a");
        hashSetString.add("a");
        System.out.println(hashSetString.size());

        List<String> listString = new ArrayList<>();
        listString.add("a");
        listString.add("a");
        System.out.println(listString.size());

        List<String> linkedListString = new LinkedList<>();
        linkedListString.add("a");
        linkedListString.add("a");
        System.out.println(linkedListString.size());

        Map<Integer, String> mapList = new HashMap<>();
        mapList.put(1, "a");
        mapList.put(1, "a");
        System.out.println(mapList.size());
        //SET - LIST - MAP bunlar interface'dir ve new'lenemez. Bunların alt türleri class oldukları için onlar new'lenebilir.
    }

}
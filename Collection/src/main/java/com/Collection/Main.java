package com.Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet x = new TreeSet();//Sadece bir tip data tutar. Sayılar için sıralı bir şekilde string'ler için alfabetik olarak sıralar. Bir nevi index gibi.
        x.add("b");
        x.add("a");
        x.add("f");
        x.forEach(item -> System.out.println(item));

        HashMap<String, String> y = new HashMap<>();//HashMap key'leri tutarken equal kullanır ve equal == operatoröne göre daha yavaştır
        y.put(new String("a"), new String("b"));
        y.put(new String("a"), new String("b"));
        System.out.println(y);

        IdentityHashMap<String, String> z = new IdentityHashMap<>();//IdenetityHaspMap equal yerine == operatörünü kullanılır. Referansları kıyaslar. Daha hızlıdır.
        z.put(new String("a"), new String("b"));
        z.put(new String("a"), new String("b"));
        System.out.println(z);

    }
}
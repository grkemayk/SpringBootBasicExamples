package com.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //MAP
        HashMap<String, String> my = new HashMap<>();// key - value -> key unique. Keyler equal'a göre unique'tir.
        IdentityHashMap<String, String> mt = new IdentityHashMap<>();//Key'ler == 'e göre unique'dir
        TreeMap<String, String> mx = new TreeMap<>();//Key'e göre index yapar.
        Hashtable<String, String> mz = new Hashtable<>();//Thread safe.
        //SET
        HashSet<String> sx = new HashSet<>();//Tek tip data. Duplicate data tutmaz.
        TreeSet<String> sy = new TreeSet<>();//Index'li tek tip data.
        //LIST
        ArrayList<String> lx = new ArrayList<>();//Tek tip data. Duplicate tutar.
        LinkedList<String> ly = new LinkedList<>();//Tek tip data.Duplicate tutar. Chain gibi tutar dataları. EKLEME ve ÇIKARTMA işlemlerinde kullanılmalı!
        Vector<String> lz = new Vector<>();//Tek tip data tutar. Duplicate tutar. Thread safe.

        //ORNEKLER

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
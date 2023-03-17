package com.EqualHascode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Main {// == Operatoru String Po
    public static void main(String[] args) {
        TestClazz a = new TestClazz("a", 1,123L);
        TestClazz b = new TestClazz("a", 1, 1234L);
        TestClazz c = a;

        Map<TestClazz, String> liste = new HashMap<>();
        liste.put(a,"Grkem");
        liste.put(b,"Grkem");
        System.out.println(liste.size());

        //System.out.println(a.toString()+"-------------"+b.toString());
        //System.out.println(Objects.equals(a.toString(), b.toString()));
        //System.out.println(a.hashCode());//Hascode bir nevi identity number gibidir.
        //System.out.println(b.hashCode());
        //System.out.println(a.equals(b));//Equals methodu birebir aynı obje olupğ olmadığı kontrol eder.
        //System.out.println(liste.size());//hashCode overriding kaldırılınca 2, çalışınca 1 olarak döner.
        //System.out.println(a == c);
        //System.out.println(a.equals(c));

        String ax = "Grkem";//String pool'da tutulan Grkem'i gösterir.
        String bx = "Grkem";//String pool'da tutulan Grkem'i gösterir.
        String cx = new String("Grkem");//new keyword heap'te yeni beri yer açar dolayısıylan new'lenmiş objelerin referansı farklıdır.
        System.out.println(ax == bx);//Referansları aynı ikiside string pool'da.
        System.out.println(ax.equals(bx));
        System.out.println(ax == cx);
        System.out.println(ax.equals(cx));

        //hashCode - ibjenin bellete ki adresine göre oluşturulan bir code. Equals'u true dönen nesnelerin hasCode'u da true dönmeli, equals false dönüyorsa hashCode false dönmese de olur ancak dönerse daha iyi olur.
        //== ve equals arasında ki fark == operatördür ve override edilemez. Heap'te ki adresleri kontrol eder ve aynıysa true döner
        //equals ise bellekte ki adresleri aynıysa true döner veya içeriği aynıysa true döner.


        TestClazzz test1 = new TestClazzz("a", "b", 1, 2);
        TestClazzz test2 = new TestClazzz("a", "b", 1, 2);
        System.out.println(test2.equals(test1));

    }
}
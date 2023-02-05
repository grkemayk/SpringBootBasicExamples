package com.FunctionalInterface;

public class Main {
    public static void main(String[] args) {

    functionalInterface interface1 = Main::method1;//Double colon(::) method referans sağlar.
    functionalInterface interface2 = Main::method2;
    functionalInterface interface11 = () -> {
        method1();
        //Veya direk buraya method yazılabilir.
    };
    MyMethod(interface1);
    MyMethod(interface2);
    }
    @FunctionalInterface
    interface functionalInterface {
        void FunctionalMethod();
    }

    static void MyMethod(functionalInterface funcInterface) {
        System.out.println("Before");
        funcInterface.FunctionalMethod();
        System.out.println("After");
    }
    static void method1() {
        System.out.println("Method 1");
    }
    static void method2() {
        System.out.println("Method2");
    }
}
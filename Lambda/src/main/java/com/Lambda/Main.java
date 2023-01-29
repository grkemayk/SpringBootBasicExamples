package com.Lambda;

public class Main {
    public static void main(String[] args) {
        functionalInterface x = () -> {
          myMethod();
        };
        x.testMethod();

        functionalInterface x2 = Main::myMethod;//Double colon format -> ClassName::Mehod name. Double colon method referance olarak kullanılır.
        genericMethod(x2);


    }
    interface functionalInterface{//Functional interface ile methodlar parametre olarak geçilir.
        void testMethod();
    }
    public static void myMethod(){
        System.out.println("Functional Interface!");
    }
    public static void genericMethod(functionalInterface a){
        System.out.println("Before method!");
        a.testMethod();
        System.out.println("After method!");
    }
}
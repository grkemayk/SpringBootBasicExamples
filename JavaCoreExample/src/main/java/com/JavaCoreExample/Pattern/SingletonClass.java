package com.JavaCoreExample.Pattern;

public class SingletonClass {
    private static SingletonClass xInstance;
    private SingletonClass() {

    }
    public static  SingletonClass GetInstance() {
        if(xInstance == null)
            xInstance = new SingletonClass();
        return xInstance;
    }
}

package com.TryResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        //Try resource bloğunun içinde ki connection sonuç ne olursa olsun kapanma garantisi verir. DOlayısıyla connection işlemlerinde kullanılması çok daha avantajlı olacaktır.
        try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
            writer.println("Hello World");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
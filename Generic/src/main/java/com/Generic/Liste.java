package com.Generic;


import java.util.ArrayList;

public class Liste<T> {
    private ArrayList<T> liste = new ArrayList<T>();

    public void ekle(T eleman){
        this.liste.add(eleman);
    }

    public ArrayList<T> getirArrayList(){
        return this.liste;
    }
}
package com.zad3;


public class DataBase implements Savable {
    @Override
    public void save() {
        System.out.println("Zapis do bazy");
    }
}

package com.zad1;


public class Dog implements Voice {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String giveVoice() {
        return "Hau hau..!";
    }
}

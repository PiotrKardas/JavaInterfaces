package com.zad1;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog("Kliford");
        Dog d2 = new Dog("Piesek");
        Dog d3 = new Dog("Azor");

        Cat c1 = new Cat("Muruczek");
        Cat c2 = new Cat("Filemon");



        List<Voice> animals = new ArrayList<Voice>();
        animals.add(d1);
        animals.add(d2);
        animals.add(d3);
        animals.add(c1);
        animals.add(c2);

        for(Voice v : animals)
            System.out.println(v.giveVoice());

    }
}

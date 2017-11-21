package com.zad3;

import java.util.ArrayList;
import java.util.List;


public class Person extends Caching{
    private String name, surname;
    private Savable savable;



    public static void main(String[] args) {
        Person person = new Person();
        person.setSavable(new DataBase());
        person.save();
        //podmiana
        person.setSavable(new Caching());
        person.save();;

      }

    public Savable getSavable() {
        return savable;
    }

    public void setSavable(Savable savable) {
        this.savable = savable;
    }

    public void save(){
        savable.save();
    }
}

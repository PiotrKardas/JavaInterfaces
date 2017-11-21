package com.zad1;


public class Cat implements Voice {

    private String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String giveVoice() {
        return "Miau miau..!!";
    }
}

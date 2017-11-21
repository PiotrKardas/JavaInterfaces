package com.zad4;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Userable {

    public Admin(String username) {
        this.username = username;
    }

    private String username;

    private List<String> roles = new ArrayList<String>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void confirmEmail(){
        System.out.println("Mail potwierdzony");
    }
}

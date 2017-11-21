package com.zad4;


public class RegularUser implements Userable {

    public RegularUser(String username) {
        this.username = username;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void confirmEmail(){
        System.out.println("Potwierdzam email");
    }
}

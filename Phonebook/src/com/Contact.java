package com;

/**
 * Created by mille_000 on 30.11.2014.
 */
public class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void print(){

        System.out.println(name + " " + phone + " " + email);
    }
    public void call(){

        System.out.println("Call " + name );
    }
}

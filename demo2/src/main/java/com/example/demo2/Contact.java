package com.example.demo2;

public class Contact {
    private String name;
    private String email;
    private String country;
 
    public Contact() {
        super();
    }
 
    public Contact(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }
 
    // getters and setters 
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String newCountry){
        this.country = newCountry;
    }

}
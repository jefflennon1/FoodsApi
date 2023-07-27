package com.foodsgroup.foodsapi.model;

public class ClientModel {
    private String name;
    private String email;
    private String phone;
    private boolean active = false;


    public ClientModel(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return active;
    }

    public void activateClient(){
        this.active = true;
    }
}

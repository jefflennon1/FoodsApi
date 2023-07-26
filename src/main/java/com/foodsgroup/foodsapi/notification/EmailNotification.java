package com.foodsgroup.foodsapi.notification;

import com.foodsgroup.foodsapi.model.ClientModel;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification {

    public EmailNotification() {
        System.out.println("get constructor!");
    }

    public void notificate(ClientModel  clientModel , String message){
        System.out.printf("Notificate %s by email %s: %s\n  ", clientModel.getName(), clientModel.getEmail(), message);
    }
}

package com.foodsgroup.foodsapi.notification;

import com.foodsgroup.foodsapi.model.ClientModel;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class EmailNotification implements Notificator {

    public EmailNotification() {
        System.out.println("get constructor e-mail notificator!");
    }

    @Override
    public void notificate(ClientModel clientModel, String message){
        System.out.printf("Notificate %s by email %s: %s\n  ", clientModel.getName(), clientModel.getEmail(), message);
    }
}

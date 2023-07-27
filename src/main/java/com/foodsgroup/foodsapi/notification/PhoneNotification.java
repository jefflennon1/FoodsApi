package com.foodsgroup.foodsapi.notification;

import com.foodsgroup.foodsapi.model.ClientModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class PhoneNotification implements Notificator {
    public PhoneNotification() {
        System.out.println("get constructor Phone notificator!");
    }

    @Override
    public void notificate(ClientModel clientModel, String message){
        System.out.printf("Notificate %s by PHONE %s: %s\n  ", clientModel.getName(), clientModel.getEmail(), message);
    }

}


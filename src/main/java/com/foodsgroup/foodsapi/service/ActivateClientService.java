package com.foodsgroup.foodsapi.service;

import com.foodsgroup.foodsapi.model.ClientModel;
import com.foodsgroup.foodsapi.notification.EmailNotification;
import org.springframework.stereotype.Component;

@Component
public class ActivateClientService {

    private EmailNotification notificator;
    public  void activate(ClientModel client){
        client.activateClient();
        notificator.notificate(client, "Your register is activate on system!");

    }
}

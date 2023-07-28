package com.foodsgroup.foodsapi.service;
import com.foodsgroup.foodsapi.model.ClientModel;
import com.foodsgroup.foodsapi.notification.EmailNotification;
import com.foodsgroup.foodsapi.notification.Notificator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ActivateClientService {

    @Inject
    private Notificator notificator;

    public ActivateClientService(EmailNotification notificator) {
        this.notificator = notificator;
    }

    public  void activate(ClientModel client){
        client.activateClient();
        notificator.notificate(client, "Your register is activate on system!!");

    }
}

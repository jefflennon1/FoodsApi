package com.foodsgroup.foodsapi.listeners;

import com.foodsgroup.foodsapi.notification.Notificator;
import com.foodsgroup.foodsapi.service.ActivatedClientEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class NotificationServiceListener {

    @Inject
    private Notificator notificator;
    @EventListener
    public void notificationServiceListener(ActivatedClientEvent event){
        notificator.notificate(event.getClient(), "Cadastro ativo no sistema!");
    }
}

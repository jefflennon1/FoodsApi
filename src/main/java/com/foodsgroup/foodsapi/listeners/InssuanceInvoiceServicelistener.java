package com.foodsgroup.foodsapi.listeners;

import com.foodsgroup.foodsapi.notification.Notificator;
import com.foodsgroup.foodsapi.service.ActivatedClientEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class InssuanceInvoiceServicelistener {
    @EventListener
    public void activatedClientListener(ActivatedClientEvent event){
        System.out.println("Invoice inssued for client: " + event.getClient().getName());
    }
}

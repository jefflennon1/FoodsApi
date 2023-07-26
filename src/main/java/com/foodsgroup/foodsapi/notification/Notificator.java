package com.foodsgroup.foodsapi.notification;

import com.foodsgroup.foodsapi.model.ClientModel;

public interface Notificator {
    void notificate(ClientModel clientModel, String message);
}

package com.foodsgroup.foodsapi.service;

import com.foodsgroup.foodsapi.model.ClientModel;

public class ActivatedClientEvent {

    private ClientModel client;

    public ActivatedClientEvent(ClientModel client) {
        super();
        this.client = client;
    }

    public ClientModel getClient() {
        return client;
    }
}

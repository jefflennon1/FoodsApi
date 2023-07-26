package com.foodsgroup.foodsapi;

import com.foodsgroup.foodsapi.model.ClientModel;
import com.foodsgroup.foodsapi.notification.Notificator;
import com.foodsgroup.foodsapi.service.ActivateClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class ControllerTest {

    @Inject
    private ActivateClientService activateClientService;

    @GetMapping("/hello")
    public String hello(){
        ClientModel client = new ClientModel("Jefferson", "jefferson@xyz", "85999999");
        activateClientService.activate(client);
        return "Hello";
    }
}

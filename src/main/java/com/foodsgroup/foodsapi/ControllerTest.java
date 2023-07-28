package com.foodsgroup.foodsapi;
import com.foodsgroup.foodsapi.model.ClientModel;
import com.foodsgroup.foodsapi.service.ActivateClientService;
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
        ClientModel client2 = new ClientModel("Jonas", "jonas@xyz", "8599993399");
        ClientModel client3 = new ClientModel("Famyn", "Famyn@xyz", "985898965");
        activateClientService.activate(client3);
        return "Hello Word";
    }
}

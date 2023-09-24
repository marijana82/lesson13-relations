package nl.novi.marijana.les12huiswerkservices.controllers;

import nl.novi.marijana.les12huiswerkservices.services.RemoteControllerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remote_controllers") //or remoteControllers? or remote-controllers?
public class RemoteControllerController {

    private final RemoteControllerService remoteControllerService;

    public RemoteControllerController(RemoteControllerService remoteControllerService) {
        this.remoteControllerService = remoteControllerService;
    }

}

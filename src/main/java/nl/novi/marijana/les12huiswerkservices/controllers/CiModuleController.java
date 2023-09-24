package nl.novi.marijana.les12huiswerkservices.controllers;

import nl.novi.marijana.les12huiswerkservices.services.CiModuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ci_modules")
public class CiModuleController {

    private final CiModuleService ciModuleService;

    public CiModuleController(CiModuleService ciModuleService) {
        this.ciModuleService = ciModuleService;
    }
}

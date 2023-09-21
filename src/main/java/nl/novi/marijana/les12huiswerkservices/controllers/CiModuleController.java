package nl.novi.marijana.les12huiswerkservices.controllers;

import nl.novi.marijana.les12huiswerkservices.services.CiModuleService;

public class CiModuleController {


    private final CiModuleService ciModuleService;

    public CiModuleController(CiModuleService ciModuleService) {
        this.ciModuleService = ciModuleService;
    }
}

package nl.novi.marijana.les12huiswerkservices.services;

import nl.novi.marijana.les12huiswerkservices.repositories.CiModuleRepository;
import org.springframework.stereotype.Service;

@Service
public class CiModuleService {

    private final CiModuleRepository ciModuleRepository;

    public CiModuleService(CiModuleRepository ciModuleRepository) {
        this.ciModuleRepository = ciModuleRepository;
    }
}

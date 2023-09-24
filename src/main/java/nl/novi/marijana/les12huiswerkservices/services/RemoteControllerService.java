package nl.novi.marijana.les12huiswerkservices.services;

import nl.novi.marijana.les12huiswerkservices.repositories.RemoteControllerRepository;
import org.springframework.stereotype.Service;

@Service
public class RemoteControllerService {

    private final RemoteControllerRepository remoteControllerRepository;

    public RemoteControllerService(RemoteControllerRepository remoteControllerRepository) {
        this.remoteControllerRepository = remoteControllerRepository;
    }
}

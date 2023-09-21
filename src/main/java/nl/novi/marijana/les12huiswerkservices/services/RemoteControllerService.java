package nl.novi.marijana.les12huiswerkservices.services;

import nl.novi.marijana.les12huiswerkservices.repositories.RemoteControllerRepository;

public class RemoteControllerService {

    private final RemoteControllerRepository remoteControllerRepository;

    public RemoteControllerService(RemoteControllerRepository remoteControllerRepository) {
        this.remoteControllerRepository = remoteControllerRepository;
    }
}

package nl.novi.marijana.les12huiswerkservices.services;

import nl.novi.marijana.les12huiswerkservices.repositories.WallBracketRepository;
import org.springframework.stereotype.Service;


@Service
public class WallBracketService {

    private final WallBracketRepository wallBracketRepository;

    public WallBracketService(WallBracketRepository wallBracketRepository) {
        this.wallBracketRepository = wallBracketRepository;
    }



}

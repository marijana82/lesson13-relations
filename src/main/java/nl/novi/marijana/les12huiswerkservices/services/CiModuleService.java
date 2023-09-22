package nl.novi.marijana.les12huiswerkservices.services;

import nl.novi.marijana.les12huiswerkservices.dtos.CiModuleDto;
import nl.novi.marijana.les12huiswerkservices.exceptions.RecordNotFoundException;
import nl.novi.marijana.les12huiswerkservices.models.CiModule;
import nl.novi.marijana.les12huiswerkservices.repositories.CiModuleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CiModuleService {

    private final CiModuleRepository ciModuleRepository;

    public CiModuleService(CiModuleRepository ciModuleRepository) {
        this.ciModuleRepository = ciModuleRepository;
    }

    //get all
    public List<CiModuleDto> getAllCiModules() {
        List<CiModule> ciModules = ciModuleRepository.findAll();
        List<CiModuleDto> ciModuleDtos = new ArrayList<>();
        for(CiModule cim : ciModules) {
            CiModuleDto cimDto = new CiModuleDto();
            cimDto.setId(cim.getId());
            cimDto.setName(cim.getName());
            cimDto.setPrice(cim.getPrice());
            cimDto.setType(cim.getType());
            ciModuleDtos.add(cimDto);
        }
        return ciModuleDtos;
    }

    //get one
    public CiModuleDto getOneCiModule(Long id) {
        Optional<CiModule> ciModuleOptional = ciModuleRepository.findById(id);
        if(ciModuleOptional.isPresent()) {
            CiModule ciModuleFound = ciModuleOptional.get();
            return transferToDto(ciModuleFound);
        } else {
            throw new RecordNotFoundException("ci module under the requested id does not exist");
        }
    }


    //save one (post-request)
    public CiModuleDto saveOneCiModule(CiModuleDto ciModuleDto) {
        CiModule ciModule = transferToModule(ciModuleDto);
        ciModuleRepository.save(ciModule);
        return transferToDto(ciModule);
    }


    //delete one


    //update one (put-request)


    //partially update one (patch-request)




    //transfer to dto method
    public CiModuleDto transferToDto(CiModule ciModuleFound) {
        CiModuleDto dtoConverted = new CiModuleDto();
        dtoConverted.setType(ciModuleFound.getType());
        dtoConverted.setPrice(ciModuleFound.getPrice());
        dtoConverted.setName(ciModuleFound.getName());
        dtoConverted.setId(ciModuleFound.getId());
        return dtoConverted;
    }


    //transfer to entity method
    public CiModule transferToModule(CiModuleDto ciModuleDto) {
        CiModule cimConverted = new CiModule();
        cimConverted.setId(ciModuleDto.getId());
        cimConverted.setName(ciModuleDto.getName());
        cimConverted.setPrice(ciModuleDto.getPrice());
        cimConverted.setType(ciModuleDto.getType());
        return cimConverted;
    }


}

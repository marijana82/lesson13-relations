package nl.novi.marijana.les12huiswerkservices.services;

//annotation @Service

import nl.novi.marijana.les12huiswerkservices.dtos.TelevisionDto;
import nl.novi.marijana.les12huiswerkservices.exceptions.RecordNotFoundException;
import nl.novi.marijana.les12huiswerkservices.models.Television;
import nl.novi.marijana.les12huiswerkservices.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TelevisionService {

    private final TelevisionRepository televisionRepository;

    //1. create constructor with dependency injection referring to repository class,
    // ---this way I force SpringBoot to instantiate televisionRepository object (above)
    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    //2. create methods that are "linked" to mapping methods and dtos in the controller and to the entities in the repository
    //De Service maakt gebruik van de gegevens die we via de Controller doorkrijgen van de Dtos

    //get all televisions - here we work with lists because we are returning many!
        //1.this method returns a list of datatype TelevisionDto + no parameters!
        //2.address all televisions saved in the repository with .findAll and save them in variable (list of entities) with datatype Television
        //3.instantiate a new array list of datatype TelevisionDto - this doesnt exist yet so i have to make one
        //4.now when i have both "ingredients" i can loop through televisions collection and save data referring to televisions in a new temporary variable of datatype Television
        //5.in the loop body: instantiate a new object of datatype TelevisionDto
        // ---and in the variable tdto save the television data received from looping through the list of Television entities
        //6. after every line of data has been added to the variable tdto, add the tdto to the list of datatype TelevisionDto!
        //7. return variable televisionDtos
    //1.
    public List<TelevisionDto> getAllTelevisions() {
        //2.list
        List<Television> televisions = televisionRepository.findAll();
        //3.list
        List<TelevisionDto> televisionDtos = new ArrayList<>();
        //4.single item
        for(Television t : televisions) {
            //5.single item
            TelevisionDto tdto = new TelevisionDto();
            tdto.setId(t.getId());
            tdto.setAmbilight(t.getAmbilight());
            tdto.setAvailableSize(t.getAvailableSize());
            tdto.setHdr(t.getHdr());
            tdto.setBrand(t.getBrand());
            tdto.setName(t.getName());
            tdto.setBluetooth(t.getBluetooth());
            tdto.setOriginalStock(t.getOriginalStock());
            tdto.setPrice(t.getPrice());
            tdto.setRefreshRate(t.getRefreshRate());
            tdto.setScreenQuality(t.getScreenQuality());
            tdto.setScreenType(t.getScreenType());
            tdto.setSold(t.getSold());
            tdto.setWifi(t.getWifi());
            tdto.setVoiceControl(t.getVoiceControl());
            tdto.setType(t.getType());
            tdto.setStartTv(t.getStartTv());
            //6.add single item to the list
            televisionDtos.add(tdto);
        }
        //7.return the list
        return televisionDtos;
    }

    //get one television - here we are returning one, so no need for a list!
    //1.this method returns a list of datatype TelevisionDto + it takes on a parameter for id + its datatype!
    //2.address one television located in the repository by calling its id in the .findById() method
    //--2.a. save the found id tv in the new optional variable
    //--3.a. optional variable has datatype Optional<Entity> because we don't know if it is present in the repository or not
    //3.call for .isPresent() method to check if the requested id is present in the repository
    //4.Optional means - id is maybe present, or maybe it's not present
    //--4.a. if it is present, getOneTelevison has to do something
    //--4.b. if it is not present, it has to do something else
    //--4.c. this is why we open an if/else condition
    //5.if id is present in the repository, the method executes the following:
    //5.a. instantiate new variable tvFound
    //5.b. use getter to reach id in the televisionOptional
    //5.c. save the id from tvOptional into tvFound
    //5.d. return the call for the method transferToDto and fill it with parameter tvFound
    //6.if id is not present in the repository, the method throws new RecordNotFoundException


    //1.
    public TelevisionDto getOneTelevision(Long id) {
        //2. + 2.a. + 3.
        Optional<Television> tvOptional = televisionRepository.findById(id);
        //4.a.b.c.
        if(tvOptional.isPresent()) {
            //5.a.b.c.
            Television tvFound = tvOptional.get();
            //transferToDto is a separate method in which body we'll "translate or convert" an entity into a dto
            //5.d. - here i am actually returning the RESULT of the method transferToDto
            return transferToDto(tvFound);
        } else {
            //6.
            throw new RecordNotFoundException("sorry, no televisions found");
        }
    }



    //save (add) one television (post-request)
    //the best practice is to create two separate "translation" methods and then just to call those methods within this response body
    //1. post-request is coming from the controller, thus the parameter datatype is of dto
    //1.a.the return goes back to the controller, thus return datatype is also of dto
    //2.call for method transferToTelevision and fill the argument with tvDto;
    // ---2.a. tvDto enters the body of the method and gets converted to datatype Television
    // ---2.b. the RETURN of the method transferToTelevision gets saved in the variable tvTransferred
    //3.save tvTransferred into the repository
    //4.once the variable has been saved into the repository, the user has to receive a response;
    //---4.a.the response has to travel from the repository to the service and from the service to the controller
    //---4.b.the response from repository to service is sent as entity, but it has to be translated from entity to dto
    //---4.c.because the service-to-the-controller communication is performed with datatype dto
    //5.

    //1. + 1.a.
    public TelevisionDto saveOneTelevision(TelevisionDto tvDto) {
        //2. + 2.a. + 2.b.
        Television tvTelevision = transferToTelevision(tvDto);
        //3.
        televisionRepository.save(tvTelevision);
        //4. + 4.a. + 4.b. + 4.c.
        //5.
        return transferToDto(tvTelevision);
    }
//how we used to do it:
        /*Television televisionNew = new Television();
        televisionNew.setName(televisionDto.getName());
        televisionNew.setType(televisionDto.getType());
        televisionNew.setBrand(televisionDto.getBrand());
        televisionNew.setAvailableSize(televisionDto.getAvailableSize());
        televisionNew.setScreenType(televisionDto.getScreenType());
        televisionNew.setPrice(televisionDto.getPrice());
        televisionRepository.save(televisionNew);
        televisionDto.setId(televisionNew.getId());
        return televisionDto;*/




    //transferToDto() method is used for entities found in repository that have to be returned to controller in the form of dto
    //transferToDto() method has to have TelevisionDto as return value! - because it is travelling back to the controller!
    //parameter has to be Television television, because the data is entering as entity from the repository
    public TelevisionDto transferToDto(Television tvFound) {
        //1.create a new container for saving data in the dto
        TelevisionDto dtoConverted = new TelevisionDto();
        //2.fill the dto container with the setter with the data we get from the Television entity
        dtoConverted.setId(tvFound.getId());
        dtoConverted.setAmbilight(tvFound.getAmbilight());
        dtoConverted.setBluetooth(tvFound.getBluetooth());
        dtoConverted.setHdr(tvFound.getHdr());
        dtoConverted.setBrand(tvFound.getBrand());
        dtoConverted.setName(tvFound.getName());
        dtoConverted.setAvailableSize(tvFound.getAvailableSize());
        dtoConverted.setPrice(tvFound.getPrice());
        dtoConverted.setSold(tvFound.getSold());
        dtoConverted.setOriginalStock(tvFound.getOriginalStock());

        //3. return dtoConverted
        return dtoConverted;
    }


    //transferToTelevision()
    public Television transferToTelevision(TelevisionDto televisionDto) {
        Television televisionConverted = new Television();
        televisionConverted.setName(televisionDto.getName());
        televisionConverted.setPrice(televisionDto.getPrice());
        televisionConverted.setType(televisionDto.getType());
        televisionConverted.setScreenType(televisionDto.getScreenType());
        televisionConverted.setAvailableSize(televisionDto.getAvailableSize());
        return televisionConverted;
    }

    //delete one television
    public void deleteTelevision(@RequestBody Long id) {
        televisionRepository.deleteById(id);
    }



    //update one television
   // public TelevisionDto updateOneTelevision() {}



}

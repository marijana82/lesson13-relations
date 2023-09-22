package nl.novi.marijana.les12huiswerkservices.controllers;

import jakarta.validation.Valid;
import nl.novi.marijana.les12huiswerkservices.dtos.TelevisionDto;
import nl.novi.marijana.les12huiswerkservices.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//annotation @RestController!
//annotation @RequestMapping with a path
// ---that refers to the collection of all mapping methods - has to be plural!
@RestController
@RequestMapping("/televisions")
public class TelevisionController {

    private final TelevisionService televisionService;

    //1. create constructor with dependency injection referring to the service
    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    //from here on mapping methods (get, post, put, patch, delete)
    //De requestMappings in de Controller worden aangepast
    // ---zodat deze de juiste response doorgeven via de Service;


    //get all televisions ??? WHY NOT LIKE THIS ??? why can't i just do televisionService.getAlltelevisions?
    @GetMapping
    public ResponseEntity<List<TelevisionDto>> getAllTelevisions() {
        return ResponseEntity.ok().body(televisionService.getAllTelevisions());
    }

    //get one television
    @GetMapping("/{id}")
    public ResponseEntity<TelevisionDto> getOneTelevision(@PathVariable("id") Long id) {
        TelevisionDto television = televisionService.getOneTelevision(id);

        return ResponseEntity.ok().body(television);
    }


    @PostMapping
    public ResponseEntity<TelevisionDto> addTelevision(@Valid @RequestBody TelevisionDto televisionDto) {
        TelevisionDto dto = televisionService.saveOneTelevision(televisionDto);

        //or create URI and fill .created with uri!
        return ResponseEntity.created(null).body(dto);
    }

    //*****RELATIONS STEP 4:
    //1. create @PostMapping method
    //2. go to TelevisionDto
    @PostMapping
    public ResponseEntity<TelevisionDto> createTelevision(@Valid @RequestBody TelevisionDto televisionDto) {

        return ResponseEntity.created(null).body();
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable  Long id) {
        televisionService.deleteTelevision(id);

        return ResponseEntity.noContent().build();
    }



}

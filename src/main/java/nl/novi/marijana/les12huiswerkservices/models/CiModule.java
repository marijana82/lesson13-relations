package nl.novi.marijana.les12huiswerkservices.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ci_modules")
public class CiModule {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //variable declarations
    private String name;
    private String type;
    private Double price;

    //ciModule must contain a list of televisions
    //because it contains a list, this side cannot be the owner
    //---because we can't save a list in the database!
    //so, in one-to-many relation, the "one" side is the target!
    @OneToMany(mappedBy = "ciModule")
    private List<Television> televisions = new ArrayList<>();
    //OR ??? private List<Television> televisions;


    //getters & setters
    public List<Television> getTelevisions() {
        return televisions;
    }

    public void setTelevisions(List<Television> televisions) {
        this.televisions = televisions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

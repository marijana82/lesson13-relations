package nl.novi.marijana.les12huiswerkservices.models;

import jakarta.persistence.*;

import java.util.HashSet;

@Entity
@Table(name="wall_brackets")
public class WallBracket {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //variable declarations
    private String size;
    private Boolean adjustable;
    private String name;
    private Double price;

    //*****RELATIONS STEP 2:
    //1. create filed variable called televisions
    //2. create many-to-many relationship between WallBracket and Television
    //---by adding annotation @ManyToMany above the field
    //3. add mappedBy="wallBrackets" to point to the owner of the relationship
    //---(owner is Television,
    // ---mappedBy refers to the field variable wallBrackets
    //---which we created in the Television class)
    //4. create getter & setter for HashSet televisions
    //5. go to the SERVICE of the owner class (TelevisionService)

    @ManyToMany(mappedBy = "wallBrackets")
    private HashSet<Television> televisions;



    //getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getAdjustable() {
        return adjustable;
    }

    public void setAdjustable(Boolean adjustable) {
        this.adjustable = adjustable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public HashSet<Television> getTelevisions() {
        return televisions;
    }

    public void setTelevisions(HashSet<Television> televisions) {
        this.televisions = televisions;
    }





}

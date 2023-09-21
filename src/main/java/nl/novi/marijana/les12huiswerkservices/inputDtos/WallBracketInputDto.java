package nl.novi.marijana.les12huiswerkservices.inputDtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class WallBracketInputDto {

    @NotNull(message="size must not be left empty")
    private String size;
    @NotNull(message="adjustability must not be left empty")
    private Boolean adjustable;

    @Size(min=1, max=30, message="name must be min 1 and max 30 characters long")
    private String name;

    @Positive(message="price must be higher than 0")
    private Double price;


    //getters & setters
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
}

package nl.novi.marijana.les12huiswerkservices.inputDtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Type;

public class CiModuleInputDto {

    @Size(min=1, max=20, message="name must be min 1 and max 20 characters long")
    private String name;

    @NotNull(message="type is required")
    private String type;

    @Positive(message="price must be higher than 0")
    private Double price;

    //getters & setters
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

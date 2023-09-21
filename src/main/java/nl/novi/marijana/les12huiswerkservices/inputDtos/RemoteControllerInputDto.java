package nl.novi.marijana.les12huiswerkservices.inputDtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class RemoteControllerInputDto {

    @NotNull(message="compatibility type is required")
    private String compatibleWith;

    @NotNull(message="battery type is required")
    private String batteryType;

    @Size(min=1, max=30, message="name must be min 1 and max 30 characters long")
    private String name;

    @NotNull(message="brand is required")
    private String brand;

    @Positive(message="price must be higher than 0")
    private Double price;

    @PositiveOrZero(message="Negative stock is not allowed")
    private Integer originalStock;


    //getters & setters
    public String getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }
}

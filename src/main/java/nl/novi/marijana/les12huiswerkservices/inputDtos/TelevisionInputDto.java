package nl.novi.marijana.les12huiswerkservices.inputDtos;

import jakarta.validation.constraints.*;

//this class of input dto is used for Post and Put methods, meaning: where we give Television as body in Postman
//unlike the output dto, the input dto has no id!
//dto class consists of the sam e fields as the entity class, but without a constructor
//and without getters and setters!
//and all fields are public!
//also, VALIDATION takes place here in the dto class! (The mother of all validations is located in the constructor class)
public class TelevisionInputDto {
    @NotNull(message="type is required")
    public String type;
    @NotNull(message="brand is required")
    public String brand;
    @Size(min=1, max=30, message="name must be min 1 and max 30 characters long")
    public String name;
    @Positive(message="price must be higher than 0")
    public Double price;
    @Size(min = 0, max = 30)
    public Double availableSize;
    @NotEmpty
    public Double refreshRate;
    @NotBlank
    public String screenType;
    @NotEmpty
    public String screenQuality;
    @NotNull
    public Boolean startTv;
    @NotNull
    public Boolean wifi;
    @NotNull
    public Boolean voiceControl;
    @AssertTrue(message="all televisions must be hdr minimum")
    public Boolean hdr;
    @NotNull
    public Boolean bluetooth;
    @NotNull
    public Boolean ambilight;
    @PositiveOrZero(message="Negative stock not allowed")
    public Integer originalStock;
    @Min(0)
    @Max(100)
    public Integer sold;


    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Double getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(Double availableSize) {
        this.availableSize = availableSize;
    }

    public Double getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public Boolean getStartTv() {
        return startTv;
    }

    public void setStartTv(Boolean startTv) {
        this.startTv = startTv;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public Boolean getHdr() {
        return hdr;
    }

    public void setHdr(Boolean hdr) {
        this.hdr = hdr;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Boolean getAmbilight() {
        return ambilight;
    }

    public void setAmbilight(Boolean ambilight) {
        this.ambilight = ambilight;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }
}

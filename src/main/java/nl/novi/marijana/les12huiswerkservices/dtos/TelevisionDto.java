package nl.novi.marijana.les12huiswerkservices.dtos;

import jakarta.validation.constraints.*;
import nl.novi.marijana.les12huiswerkservices.models.Television;

//here no validation necessary because this is the output dto, the validation takes place in the input dto
public class TelevisionDto {
            private Long id;
            private String type;
            private String brand;
            private String name;
            private Double price;
            private Double availableSize;
            private Double refreshRate;
            private String screenType;
            private String screenQuality;
            private Boolean startTv;
            private Boolean wifi;
            private Boolean voiceControl;
            private Boolean hdr;
            private Boolean bluetooth;
            private Boolean ambilight;
            private Integer originalStock;
            private Integer sold;

    //*****RELATIONS STEP 5:
        //1. create wallBracketIds variable where we will save Ids of the wallBrackets
    //******CONTINUE FROM HERE!
            public long[] wallBracketIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

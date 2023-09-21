package nl.novi.marijana.les12huiswerkservices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Television {
    @Id
    @GeneratedValue
    Long id;

    //variable declarations
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

    //default constructor
    public Television() {}


    //all-variables-constructor
    public Television(
            Long id,
            String type,
            String brand,
            String name,
            Double price,
            Double availableSize,
            Double refreshRate,
            String screenType,
            String screenQuality,
            Boolean startTv,
            Boolean wifi,
            Boolean voiceControl,
            Boolean hdr,
            Boolean bluetooth,
            Boolean ambilight,
            Integer originalStock,
            Integer sold
            ) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.availableSize = availableSize;
        this.refreshRate = refreshRate;
        this.screenType = screenType;
        this.screenQuality = screenQuality;
        this.startTv = startTv;
        this.wifi = wifi;
        this.voiceControl = voiceControl;
        this.hdr = hdr;
        this.bluetooth = bluetooth;
        this.ambilight = ambilight;
        this.originalStock = originalStock;
        this.sold = sold;
    }


        //getters & setters for all variables

        //id
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        //type
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        //brand
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        //name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        //price
        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        //size
        public Double getAvailableSize() {
            return availableSize;
        }

        public void setAvailableSize(Double availableSize) {
            this.availableSize = availableSize;
        }

        //refresh rate
        public Double getRefreshRate() {
            return refreshRate;
        }

        public void setRefreshRate(Double refreshRate) {
            this.refreshRate = refreshRate;
        }

        //screen type
        public String getScreenType() {
            return screenType;
        }

        public void setScreenType(String screenType) {
            this.screenType = screenType;
        }

        //screen quality
        public String getScreenQuality() {
            return screenQuality;
        }

        public void setScreenQuality(String screenQuality) {
            this.screenQuality = screenQuality;
        }

        //start tv
        public Boolean getStartTv() {
            return startTv;
        }

        public void setStartTv(Boolean startTv) {
            this.startTv = startTv;
        }

        //wifi
        public Boolean getWifi() {
            return wifi;
        }

        public void setWifi(Boolean wifi) {
            this.wifi = wifi;
        }

        //voice control
        public Boolean getVoiceControl() {
            return voiceControl;
        }

        public void setVoiceControl(Boolean voiceControl) {
            this.voiceControl = voiceControl;
        }

        //hdr
        public Boolean getHdr() {
            return hdr;
        }

        public void setHdr(Boolean hdr) {
            this.hdr = hdr;
        }

        //bluetooth
        public Boolean getBluetooth() {
            return bluetooth;
        }

        public void setBluetooth(Boolean bluetooth) {
            this.bluetooth = bluetooth;
        }

        //ambilight
        public Boolean getAmbilight() {
            return ambilight;
        }

        public void setAmbilight(Boolean ambilight) {
            this.ambilight = ambilight;
        }

        //original stock
        public Integer getOriginalStock() {
            return originalStock;
        }

        public void setOriginalStock(Integer originalStock) {
            this.originalStock = originalStock;
        }

        //sold
        public Integer getSold() {
            return sold;
        }

        public void setSold(Integer sold) {
            this.sold = sold;
        }



    }




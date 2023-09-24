package nl.novi.marijana.les12huiswerkservices.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="televisions")
public class Television {
    //primary key
    @Id
    //strategy=GenerationType.IDENTITY makes sure the ids in the table get generated from 1 to higher up.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    //*****RELATIONS STEP 1:
    // Television is *the owner* of the relationships - my choice!
    // 1. create field variable called wallBrackets
    // 2. create many-to-many relationship between Television and WallBracket
    //---by adding annotation @ManyToMany above the field
    // 3. create getter & setter for List wallBrackets
    // 4. go to the WallBracket entity

    //owner of the tv-wallBracket relationship
    //the id gets saved in the owner!
    @ManyToMany
    @JoinColumn(name = "compatible_with_wall_bracket")
    private List<WallBracket> wallBrackets = new ArrayList<>();

    //owner of the tv-remoteController relationship
    //the id gets saved in the owner!
    @OneToOne
    @JoinColumn(name = "compatible_with_remote_controller")
    private RemoteController remoteController;


    //in many-to-one relation the "many" side has to be the owner!
    @ManyToOne
    @JoinColumn(name = "compatible_with_ci_module")
    private CiModule ciModule;


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

        //wallBrackets
        public List<WallBracket> getWallBrackets() {
        return wallBrackets;
        }

        public void setWallBrackets(List<WallBracket> wallBrackets) {
        this.wallBrackets = wallBrackets;
        }


    public void setRemoteController(RemoteController rc) {
    }
}




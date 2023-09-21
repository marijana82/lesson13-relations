package nl.novi.marijana.les12huiswerkservices.dtos;

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
    @Size(max=30, message="name must be min 0 and max 30 characters long")
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


}

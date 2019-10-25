package by.itacademy.spaceport.parametr;

import by.itacademy.spaceport.enam.FuelType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FuelTypeParameter implements Parameter<FuelType> {

    @JsonProperty("fuelType")
    private FuelType fuelType;

    @Override
    public FuelType value() {
        return fuelType;
    }
}

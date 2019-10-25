package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuelParameter implements Parameter<Integer> {

    @JsonProperty("fuel") private Integer fuel;

    @Override
    public Integer value() {
        return fuel;
    }
}

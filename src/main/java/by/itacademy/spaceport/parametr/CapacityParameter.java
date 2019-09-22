package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CapacityParameter implements Parameter<Integer> {

    @JsonProperty("capacity")
    private Integer capacity;

    @Override
    public Integer value() {
        return capacity;
    }
}

package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArmorParameter implements Parameter<Integer> {

    @JsonProperty("armor")
    private Integer armor;

    @Override
    public Integer value() {
        return armor;
    }
}

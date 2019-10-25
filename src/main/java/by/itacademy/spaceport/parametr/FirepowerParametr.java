package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FirepowerParametr implements Parameter<Integer> {

    @JsonProperty("firepower") private Integer firepower;

    @Override
    public Integer value() {
        return firepower;
    }
}

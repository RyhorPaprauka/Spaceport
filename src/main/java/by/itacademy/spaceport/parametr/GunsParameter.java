package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GunsParameter implements Parameter<Integer> {

    @JsonProperty("guns")
    private Integer guns;

    @Override
    public Integer value() {
        return guns;
    }
}

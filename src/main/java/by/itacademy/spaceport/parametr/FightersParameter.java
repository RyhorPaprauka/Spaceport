package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FightersParameter implements Parameter<Integer> {

    @JsonProperty("fighters")
    private Integer fighters;

    @Override
    public Integer value() {
        return fighters;
    }
}

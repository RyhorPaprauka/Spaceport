package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ColorParameter implements Parameter<String> {

    @JsonProperty("color")
    private String color;

    @Override
    public String value() {
        return color;
    }
}

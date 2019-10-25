package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameParameter implements Parameter<String> {

    @JsonProperty("name") private String name;

    @Override
    public String value() {
        return name;
    }
}

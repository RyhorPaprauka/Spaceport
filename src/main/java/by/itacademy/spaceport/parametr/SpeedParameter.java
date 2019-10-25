package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeedParameter implements Parameter<Integer> {

    @JsonProperty("speed") private Integer speed;

    @Override
    public Integer value() {
        return speed;
    }
}

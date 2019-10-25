package by.itacademy.spaceport.order;

import by.itacademy.spaceport.factory.ShipTypeFactory;
import by.itacademy.spaceport.parametr.Parameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class BuildOrder {

    @JsonProperty("type")
    private ShipTypeFactory type;
    private Set<Parameter> parameters;
}

package by.itacademy.spaceport.ship;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transport extends CivilShip {

    private Integer capacity;

    @Builder
    public Transport(String color, Integer capacity) {
        super(color);
        this.capacity = capacity;
    }
}

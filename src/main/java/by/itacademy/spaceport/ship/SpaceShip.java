package by.itacademy.spaceport.ship;

import by.itacademy.spaceport.enam.FuelType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SpaceShip {

    private String name;
    private Integer fuel;
    private FuelType fuelType;
    private Integer armor;
}

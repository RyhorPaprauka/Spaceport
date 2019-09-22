package by.itacademy.spaceport.ship;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cruiser extends WarShip {

    private Integer guns;

    @Builder
    public Cruiser(Integer firePower, Integer guns) {
        super(firePower);
        this.guns = guns;
    }
}

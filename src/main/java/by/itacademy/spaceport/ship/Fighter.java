package by.itacademy.spaceport.ship;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fighter extends WarShip {

    private Integer speed;

    @Builder
    public Fighter(Integer firePower, Integer speed) {
        super(firePower);
        this.speed = speed;
    }
}

package by.itacademy.spaceport.ship;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeathStar extends WarShip {

    private Integer fighters;

    @Builder
    public DeathStar(Integer firePower, Integer fighters) {
        super(firePower);
        this.fighters = fighters;
    }
}

package by.itacademy.spaceport.ship;

import by.itacademy.spaceport.enam.ScannerType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pathfinder extends WarShip {

    private ScannerType scanner;

    @Builder
    public Pathfinder(Integer firePower, ScannerType scanner) {
        super(firePower);
        this.scanner = scanner;
    }
}

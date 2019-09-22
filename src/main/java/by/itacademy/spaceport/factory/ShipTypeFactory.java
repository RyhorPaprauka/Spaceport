package by.itacademy.spaceport.factory;

import by.itacademy.spaceport.parametr.CapacityParameter;
import by.itacademy.spaceport.parametr.ColorParameter;
import by.itacademy.spaceport.parametr.FightersParameter;
import by.itacademy.spaceport.parametr.FirepowerParametr;
import by.itacademy.spaceport.parametr.GunsParameter;
import by.itacademy.spaceport.parametr.Parameter;
import by.itacademy.spaceport.parametr.ScannerParameter;
import by.itacademy.spaceport.parametr.SpeedParameter;
import by.itacademy.spaceport.ship.Cruiser;
import by.itacademy.spaceport.ship.DeathStar;
import by.itacademy.spaceport.ship.Fighter;
import by.itacademy.spaceport.ship.Pathfinder;
import by.itacademy.spaceport.ship.SpaceShip;
import by.itacademy.spaceport.ship.Transport;

import java.util.Set;

public enum ShipTypeFactory implements ShipFactory {
    TRANSPORT {
        @Override
        public SpaceShip build(Set<Parameter> parameters) {
            Transport transport = Transport.builder()
                    .color(getValue(parameters, ColorParameter.class))
                    .capacity(getValue(parameters, CapacityParameter.class))
                    .build();
            setCommonParameters(transport, parameters);
            return transport;
        }
    },
    FIGHTER {
        @Override
        public SpaceShip build(Set<Parameter> parameters) {
            Fighter fighter = Fighter.builder()
                    .firePower(getValue(parameters, FirepowerParametr.class))
                    .speed(getValue(parameters, SpeedParameter.class))
                    .build();
            setCommonParameters(fighter, parameters);
            return fighter;
        }
    },
    CRUISER {
        @Override
        public SpaceShip build(Set<Parameter> parameters) {
            Cruiser cruiser = Cruiser.builder()
                    .firePower(getValue(parameters, FirepowerParametr.class))
                    .guns(getValue(parameters, GunsParameter.class))
                    .build();
            setCommonParameters(cruiser, parameters);
            return cruiser;
        }
    },
    PATHFINDER {
        @Override
        public SpaceShip build(Set<Parameter> parameters) {
            Pathfinder pathfinder = Pathfinder.builder()
                    .firePower(getValue(parameters, FirepowerParametr.class))
                    .scanner(getValue(parameters, ScannerParameter.class))
                    .build();
            setCommonParameters(pathfinder, parameters);
            return pathfinder;
        }
    },
    DEATH_STAR {
        @Override
        public SpaceShip build(Set<Parameter> parameters) {
            DeathStar deathStar = DeathStar.builder()
                    .firePower(getValue(parameters, FirepowerParametr.class))
                    .fighters(getValue(parameters, FightersParameter.class))
                    .build();
            setCommonParameters(deathStar, parameters);
            return deathStar;
        }
    }
}

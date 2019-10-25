package by.itacademy.spaceport.factory;

import by.itacademy.spaceport.parametr.ArmorParameter;
import by.itacademy.spaceport.parametr.FuelParameter;
import by.itacademy.spaceport.parametr.FuelTypeParameter;
import by.itacademy.spaceport.parametr.NameParameter;
import by.itacademy.spaceport.parametr.Parameter;
import by.itacademy.spaceport.ship.SpaceShip;

import java.util.Optional;
import java.util.Set;

public interface ShipFactory {

    SpaceShip build(Set<Parameter> parameters);

    default void setCommonParameters(SpaceShip ship, Set<Parameter> parameters) {
        ship.setName(getValue(parameters, NameParameter.class));
        ship.setArmor(getValue(parameters, ArmorParameter.class));
        ship.setFuel(getValue(parameters, FuelParameter.class));
        ship.setFuelType(getValue(parameters, FuelTypeParameter.class));
    }

    @SuppressWarnings("unchecked")
    default <T> T getValue(Set<Parameter> parameters, Class clazz) {
        Optional<Parameter> parameter = parameters.stream()
                .filter(clazz::isInstance)
                .findFirst();
        return (T) parameter.map(Parameter::value)
                .orElse(null);
    }
}

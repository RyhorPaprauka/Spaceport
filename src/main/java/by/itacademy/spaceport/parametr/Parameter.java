package by.itacademy.spaceport.parametr;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "class")
@JsonSubTypes({
        @Type(value = ArmorParameter.class, name = "armor"),
        @Type(value = CapacityParameter.class, name = "capacity"),
        @Type(value = ColorParameter.class, name = "color"),
        @Type(value = FightersParameter.class, name = "fighter"),
        @Type(value = FirepowerParametr.class, name = "firepower"),
        @Type(value = FuelParameter.class, name = "fuel"),
        @Type(value = FuelTypeParameter.class, name = "fuelType"),
        @Type(value = GunsParameter.class, name = "guns"),
        @Type(value = NameParameter.class, name = "name"),
        @Type(value = ScannerParameter.class, name = "scanner"),
        @Type(value = SpeedParameter.class, name = "speed"),
})
public interface Parameter<T> {

    T value();
}

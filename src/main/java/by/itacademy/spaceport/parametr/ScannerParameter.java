package by.itacademy.spaceport.parametr;

import by.itacademy.spaceport.enam.ScannerType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScannerParameter implements Parameter<ScannerType> {

    @JsonProperty("scanner")
    private ScannerType scanner;

    @Override
    public ScannerType value() {
        return scanner;
    }
}

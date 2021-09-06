package Chapter6Exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureCalcTest {
    @Test
    @DisplayName("Converting Temperature in Celsius to Fahrenheit")
    void aTemperatureInFahrenheitCanBeConvertedToCelsius() {
        TemperatureCalc tempCalc = new TemperatureCalc();
        assertEquals(10.0, tempCalc.getCelsius(50));
    }

    @Test
    @DisplayName("Converting Temperature in Fahrenheit to Celsius")
    void aTemperatureValueInCelsiusCanBeConvertedToFahrenheit() {
        TemperatureCalc tempCalc = new TemperatureCalc();
        assertEquals(75.60000000000001, tempCalc.getFahrenheit(10.0));
    }
}
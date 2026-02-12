import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;

    @BeforeEach
    public void setUp() {
        this.temperatureConverter = new TemperatureConverter();
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelcius(32.0));
        assertEquals(32.0, temperatureConverter.fahrenheitToCelcius(89.6));
        assertEquals(-40.0, temperatureConverter.fahrenheitToCelcius(-40.0));;

    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(122.0, temperatureConverter.celsiusToFahrenheit(50.0));
        assertEquals(-75.64, temperatureConverter.celsiusToFahrenheit(-59.8));
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0));


    }

    @Test
    void isExtremeTemperature() {
        assertFalse(temperatureConverter.isExtremeTemperature(0));
        assertFalse(temperatureConverter.isExtremeTemperature(-30));
        assertTrue(temperatureConverter.isExtremeTemperature(60));
        assertTrue(temperatureConverter.isExtremeTemperature(-60));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(36.85000000000002, temperatureConverter.kelvinToCelsius(310));
        assertEquals(-273.149, temperatureConverter.kelvinToCelsius(0.001));
        assertEquals(-283.15, temperatureConverter.kelvinToCelsius(-10));

    }
}
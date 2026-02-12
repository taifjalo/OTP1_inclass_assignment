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
        assertEquals(26.850000000000023, temperatureConverter.kelvinToCelsius(300));
        assertEquals(-273.15, temperatureConverter.kelvinToCelsius(0));
        assertEquals(-393.15, temperatureConverter.kelvinToCelsius(-120));

    }
}
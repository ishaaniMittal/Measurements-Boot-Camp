import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ishaani on 30/7/15.
 */
public class TemperatureTestClass {

    @Test
    public void convertCelciusToFarenheit(){
        Temperature celcius = new Celcius(30);
        Temperature farenheit = new Farenheit(86);
        assertTrue(farenheit.equals(celcius));
    }
}
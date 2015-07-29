import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by IShAani on 29-07-2015.
 */
public class TestClass {

    @Test
    public void testToCheckConversionFromMeterToCM(){
        Meter meter = new Meter(2);
        assertEquals(new Centimeter(200),meter.convertToCentimeter());


    }

}
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IShAani on 29-07-2015.
 */
public class TestClass {

    @Test
    public void testToCheckConversionFromMeterToCMCorrect(){
       BaseLengthInCM meter = new Meter(2);
       Centimeter centimeter = new Centimeter(200);
       assertTrue(meter.equals(centimeter));
    }

    @Test
    public void testToCheckConversionFromMeterToCMWrong(){
        BaseLengthInCM meter = new Meter(2);
        BaseLengthInCM centimeter = new Centimeter(100);
        assertFalse(meter.equals(centimeter));
    }

    @Test
    public void testToCheckConversionFromInchToCmCorrect(){
        BaseLengthInCM inch = new Inch(5);
        BaseLengthInCM centimeter = new Centimeter(12.7);
        assertTrue(inch.equals(centimeter));
    }

    @Test
    public void testToCheckConversionFromInchToCmWrong(){
        BaseLengthInCM inch = new Inch(5);
        BaseLengthInCM centimeter = new Centimeter(12);
        assertFalse(inch.equals(centimeter));
    }

    @Test
    public void testToCheckConversionFromInchToFeetCorrect(){
        BaseLengthInCM inch = new Inch(12);
        BaseLengthInCM feet = new Feet(1);
        assertTrue(inch.equals(feet));
    }

    @Test
    public void testToCheckConversionFromInchToFeetWrong(){
        BaseLengthInCM inch = new Inch(12);
        BaseLengthInCM feet = new Feet(3);
        assertFalse(inch.equals(feet));
    }

    @Test
    public void testToCheckConversionFromYardToFeetCorrect(){
        BaseLengthInCM yard = new Yard(1);
        BaseLengthInCM feet = new Feet(3);
        assertTrue(yard.equals(feet));
    }

    @Test
    public void testToCheckConversionFromYardToFeetWrong(){
        BaseLengthInCM yard = new Yard(1);
        BaseLengthInCM feet = new Feet(4);
        assertFalse(yard.equals(feet));
    }

    @Test
    public void testToCheckConversionFromCentimeterToInch(){
        BaseLengthInCM centimeter = new Centimeter(2.54);
        BaseLengthInCM inch = centimeter.convertToInch();
        assertTrue(inch.equals(new Inch(1)));
    }

    @Test
    public void testToCheckConversionFromMeterToInchReturnsInch(){
        BaseLengthInCM meter = new Meter(2.54);
        BaseLengthInCM inch = meter.convertToInch();
        assertTrue(inch.equals(new Inch(100)));
    }

    @Test
    public void test(){
        BaseLengthInCM inch = new Inch(1);
        BaseLengthInCM inch2 = inch.convertToInch();
        assertTrue(inch.equals(inch2));
    }

    @Test
    public void addition(){
        BaseLengthInCM inch = new Inch(3);
        BaseLengthInCM inch2 = new Centimeter(2.54);
        System.out.println(inch.add(inch2));
    }

}
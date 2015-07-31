/**
 * Created by IShAani on 29-07-2015.
 */
public class Centimeter extends BaseLengthInCM {


    public Centimeter(double value) {
        super(value);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }

    @Override
    public BaseLengthInCM add(BaseLengthInCM length1) {
        return new BaseLengthInCM(this.getValue()+length1.getValue());

    }


   /* @Override
    public Inch convertFromCmToInch(){
        return new Inch(super.getValue()/2.54);
    }*/
}

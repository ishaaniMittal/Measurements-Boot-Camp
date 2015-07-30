/**
 * Created by IShAani on 29-07-2015.
 */
public class Yard extends BaseLengthInCM {

    public Yard(double value){
        super(value*3*12*2.54);
    }

    @Override
    public double getValue() {
        return (super.getValue()/3*12*2.54);
    }
}

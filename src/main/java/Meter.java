/**
 * Created by IShAani on 29-07-2015.
 */
public class Meter extends BaseLengthInCM {


    public Meter(double value) {
        super(value*100);
    }

    @Override
    public double getValue() {
        return (super.getValue()/100.0);
    }
}

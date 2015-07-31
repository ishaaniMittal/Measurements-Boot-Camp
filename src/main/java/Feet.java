/**
 * Created by IShAani on 29-07-2015.
 */
public class Feet extends BaseLengthInCM{

    public Feet(double value){
        super(value*12*2.54);
    }

    @Override
    public double getValue() {
        return (super.getValue()/12*2.54);
    }

    @Override
    public BaseLengthInCM add(BaseLengthInCM length1) {
        return new BaseLengthInCM(this.getValue()+length1.getValue());
    }
}

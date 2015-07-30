/**
 * Created by IShAani on 29-07-2015.
 */
public class Inch extends BaseLengthInCM {

    public Inch(double value){
        super(value*2.54);
    }

    public Inch(){

    }

    @Override
    public double getValue() {
        return (super.getValue()/2.54);
    }
}

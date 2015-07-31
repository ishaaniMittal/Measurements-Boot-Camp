/**
 * Created by ishaani on 30/7/15.
 */
public class Celcius extends Temperature {

    public Celcius(double temp){
        super(temp);
    }

    @Override
    public Temperature valueInBaseUnit(){
        return new Celcius(getTemperature());
    }

}

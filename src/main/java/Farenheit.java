/**
 * Created by ishaani on 30/7/15.
 */
public class Farenheit extends Temperature {

    public Farenheit(double temp){
        super(temp);
    }

    @Override
    public Temperature valueInBaseUnit(){
        return new Farenheit((getTemperature()-32)*5/9);
    }
}

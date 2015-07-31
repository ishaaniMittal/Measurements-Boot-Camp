/**
 * Created by ishaani on 30/7/15.
 */
public abstract class Temperature {

    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public Temperature(){
        
    }

    public double getTemperature(){
        return temperature;
    }

    public abstract Temperature valueInBaseUnit();

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature=" + temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Temperature that = (Temperature) o;
        return Double.compare(that.temperature, temperature) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(temperature);
        return (int) (temp ^ (temp >>> 32));
    }

}

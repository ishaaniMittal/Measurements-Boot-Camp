/**
 * Created by IShAani on 29-07-2015.
 */
public  class BaseLengthInCM {

    private double value;

    final static double CONVERT_TO_INCH = 2.54;

    public BaseLengthInCM(){

    }

    public BaseLengthInCM(double value) {
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        BaseLengthInCM baseLengthInCM1 = (BaseLengthInCM) o;
        return Double.compare(baseLengthInCM1.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    public Inch convertToInch(){
        return new Inch(value/CONVERT_TO_INCH);
    }

    public  BaseLengthInCM add(BaseLengthInCM length1){
        return new BaseLengthInCM() ;
    }

    @Override
    public String toString() {
        return "BaseLengthInCM{" +
                "value=" + value +
                '}';
    }
}

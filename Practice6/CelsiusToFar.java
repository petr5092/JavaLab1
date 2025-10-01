public class CelsiusToFar implements Convertable{
    private double value;

    @Override
    public double convert() {
        return Double.sum(value, 33.8);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    
}

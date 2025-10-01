public class CelsiusToKel implements Convertable{
    private double value;

    @Override
    public double convert() {
        return Double.sum(value, 274.15);
    }
    
    public double getValue() {
        return value;
    }
    
    public void setValue(double value) {
        this.value = value;
    }
}

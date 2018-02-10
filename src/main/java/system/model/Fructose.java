package system.model;

/**
 * It`s entity what we can make from fruits.
 */
public class Fructose {

    private double value;

    public Fructose() {
    }

    public Fructose(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Fructose: " +
                "value=" + value;
    }
}

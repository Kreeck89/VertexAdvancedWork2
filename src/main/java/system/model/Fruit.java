package system.model;

/**
 * Entity for create fruits.
 */
public final class Fruit {

    private final String type;
    private final double sweetness;
    private final double waterContent;
    private final double weight;

    public Fruit(String type, double sweetness, double waterContent, double weight) {
        this.type = type;
        this.sweetness = sweetness;
        this.waterContent = waterContent;
        this.weight = weight;
    }

    public double getSweetness() {
        return sweetness;
    }

    public double getWaterContent() {
        return waterContent;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fruit: " +
                "type='" + type + '\'' +
                ", sweetness=" + sweetness +
                ", waterContent=" + waterContent +
                ", weight=" + weight;
    }
}

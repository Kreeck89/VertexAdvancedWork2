package system.model;

import com.sun.istack.internal.NotNull;

/**
 * Entity for creates canned food from fruits.
 */
public class CannedFood {

    private Fruit fruit;
    private double water;
    private double sugar;

    public CannedFood() {
    }

    public Fruit getFruit() {
        return fruit;
    }

    public double getWater() {
        return water;
    }

    public double getSugar() {
        return sugar;
    }

    public static class Builder {
        private CannedFood instance;

        public Builder() {
            instance = new CannedFood();
        }

        public Builder withFruit(@NotNull Fruit fruit) {
            instance.fruit = fruit;
            return this;
        }

        public Builder withWater(int water) {
            instance.water = water;
            return this;
        }

        public Builder withSugar(int sugar) {
            instance.sugar = sugar;
            return this;
        }

        public CannedFood build() {
            return instance;
        }
    }

    @Override
    public String toString() {
        return "CannedFood: " +
                "fruit=" + fruit +
                ", water=" + water +
                ", sugar=" + sugar;
    }
}

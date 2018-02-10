package system.Factory;

import system.model.CannedFood;
import system.model.Fruit;

/**
 * Factory for create canned food by fruits.
 */
public class CannedFactory {

    private static CannedFactory INSTANCE = null;

     public static CannedFactory cannedFactory() {
        if (INSTANCE == null) {
            INSTANCE = new CannedFactory();
        }
         return INSTANCE;
    }

    public CannedFood returnCanned(Fruit fruit) {
        if (fruit.getType().equals("APPLE")) {
            return new CannedFood.Builder().withFruit(fruit).withSugar(5).withWater(1).build();
        } else if (fruit.getType().equals("PINEAPPLE")) {
            return new CannedFood.Builder().withFruit(fruit).withWater(1).build();
        } else if (fruit.getType().equals("PEACH")) {
            return new CannedFood.Builder().withFruit(fruit).withSugar(2).withWater(2).build();
        }
        return null;
    }
}

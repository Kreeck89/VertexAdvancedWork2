package system.Factory.impl;

import system.Factory.CannedFactory;
import system.model.CannedFood;
import system.model.Fruit;

/**
 * Factory for create canned food by fruits.
 */
public class CannedFactoryImpl implements CannedFactory {

    private static CannedFactoryImpl INSTANCE = null;

     public static CannedFactoryImpl cannedFactory() {
        if (INSTANCE == null) {
            INSTANCE = new CannedFactoryImpl();
        }
         return INSTANCE;
    }

    @Override
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

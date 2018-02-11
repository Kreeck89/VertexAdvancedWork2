package system.Factory.proxy;

import system.Factory.impl.CannedFactoryImpl;
import system.model.CannedFood;
import system.model.Fruit;

/**
 * Factory for check is canned a fruits before use.
 */
public class ProxyFactory {

    CannedFactoryImpl factory = new CannedFactoryImpl();

    public CannedFood checkAndReturnCanned(Fruit fruit) {
        double check = fruit.getWaterContent() * 100 / fruit.getWeight();
        if (check < 30.0) {
            System.out.println("Your fruits is rotten!");
        } else {
            return factory.returnCanned(fruit);
        }
        return null;
    }
}

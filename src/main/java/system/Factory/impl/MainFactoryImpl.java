package system.Factory.impl;

import system.Factory.CannedFactory;
import system.model.CannedFood;
import system.model.Fruit;
import system.model.Fructose;

/**
 * Factory for create fructose and wrapper for canned factory.
 */
public class MainFactoryImpl implements CannedFactory {

    @Override
    public CannedFood returnCanned(Fruit fruit) {
        CannedFactory cannedFactory = new CannedFactoryImpl();
        return cannedFactory.returnCanned(fruit);
    }

    public Fructose getFructose(Fruit fruit) {
        Fructose fructose = new Fructose();
        double sweetness = fruit.getSweetness();
        fructose.setValue(sweetness * 0.8);
        return fructose;
    }
}

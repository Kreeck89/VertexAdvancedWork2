package system.Factory;

import system.model.Fruit;
import system.model.Fructose;

/**
 * Factory for create fructose and wrapper for canned factory.
 */
public class MainFactory extends CannedFactory {

    public Fructose getFructose(Fruit fruit) {
        Fructose fructose = new Fructose();
        double sweetness = fruit.getSweetness();
        fructose.setValue(sweetness * 0.8);
        return fructose;
    }
}

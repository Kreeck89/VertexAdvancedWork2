package system.Factory;

import system.model.CannedFood;
import system.model.Fruit;

public interface CannedFactory {

    CannedFood returnCanned(Fruit fruit);
}

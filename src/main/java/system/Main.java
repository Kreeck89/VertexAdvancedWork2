package system;

import system.Factory.impl.MainFactoryImpl;
import system.Factory.proxy.ProxyFactory;
import system.model.CannedFood;
import system.model.Fructose;
import system.model.Fruit;
import system.model.FruitName;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit(FruitName.PINEAPPLE.toString(), 15.5, 20, 50.4);
        System.out.println(fruit);
        ProxyFactory factory = new ProxyFactory();
        CannedFood cannedFood = factory.checkAndReturnCanned(fruit);
        System.out.println(cannedFood);

        MainFactoryImpl factory2 = new MainFactoryImpl();
        Fructose fructose = factory2.getFructose(fruit);
        System.out.println(fructose);
    }
}

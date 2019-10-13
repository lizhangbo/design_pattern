package create.factory.abstractFactory;

import create.factory.product.Bag;
import create.factory.product.Fruit;
import create.factory.product.bag.BananaBag;
import create.factory.product.fruit.Banana;

/**
 * @author lizhangbo
 * @title: BananaFactory
 * @projectName pattern
 * @description: TODO
 * @date 2019/7/28  18:02
 */
public class BananaFactory extends AbstractFactory {
    public Fruit getFruit() {
        return new Banana();
    }

    public Bag getBag() {
        return new BananaBag();
    }
}

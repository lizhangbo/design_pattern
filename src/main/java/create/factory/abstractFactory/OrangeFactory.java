package create.factory.abstractFactory;

import create.factory.product.Bag;
import create.factory.product.Fruit;
import create.factory.product.bag.OrangeBag;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title: OrangeFactory
 * @projectName pattern
 * @description: TODO
 * @date 2019/7/28  18:02
 */
public class OrangeFactory extends AbstractFactory {
    public Fruit getFruit() {
        return new Orange(50, "peter");
    }

    public Bag getBag() {
        return new OrangeBag();
    }
}

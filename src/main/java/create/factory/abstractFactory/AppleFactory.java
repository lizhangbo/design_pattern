package create.factory.abstractFactory;

import create.factory.product.Bag;
import create.factory.product.Fruit;
import create.factory.product.bag.AppleBag;
import create.factory.product.fruit.Apple;

/**
 * @author lizhangbo
 * @title: AppleFactory
 * @projectName pattern
 * @description: TODO
 * @date 2019/7/28  18:02
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}

package create.factory.fatoryMethod;

import create.factory.product.Fruit;
import create.factory.product.fruit.Apple;

/**
 * @author lizhangbo
 * @title: AppleFactory
 * @projectName pattern
 * @description: 苹果工厂
 * @date 2019/5/19  15:50
 */
public class AppleFactory implements FruitFactory {
    public Fruit getFruit() {
        return new Apple();
    }
}

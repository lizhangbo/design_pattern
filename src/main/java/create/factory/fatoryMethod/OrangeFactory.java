package create.factory.fatoryMethod;

import create.factory.product.Fruit;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title: OrangeFactory
 * @projectName pattern
 * @description: 橘子工厂
 * @date 2019/5/19  15:45
 */
public class OrangeFactory implements FruitFactory {
    public Fruit getFruit() {
        return new Orange(1, "砂糖橘");
    }
}

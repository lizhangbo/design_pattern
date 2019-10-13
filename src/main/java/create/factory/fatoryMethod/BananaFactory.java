package create.factory.fatoryMethod;

import create.factory.product.Fruit;
import create.factory.product.fruit.Banana;

/**
 * @author lizhangbo
 * @title: BananaFactory
 * @projectName pattern
 * @description: 香蕉工厂
 * @date 2019/5/19  15:49
 */
public class BananaFactory implements FruitFactory {
    public Fruit getFruit() {
        return new Banana();
    }
}

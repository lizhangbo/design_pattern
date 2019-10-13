package create.factory.fatoryMethod;

import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: FruitFactory
 * @projectName pattern
 * @description: 工厂方法接口
 * @date 2019/5/19  15:44
 */
public interface FruitFactory {
    Fruit getFruit();//获得水果
}

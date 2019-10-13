package create.factory.abstractFactory;

import create.factory.product.Bag;
import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: AbstractFactory
 * @projectName pattern
 * @description: 抽象水果工厂
 * @date 2019/7/28  18:02
 */
public abstract class AbstractFactory {
    public abstract Fruit getFruit();
    public abstract Bag getBag();
}

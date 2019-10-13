package create.factory.simple;

import create.factory.product.Fruit;
import create.factory.product.fruit.Apple;
import create.factory.product.fruit.Banana;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title: StaticFactory
 * @projectName pattern
 * @description: 简单工厂模式 --- 静态工厂模式
 * @date 2019/5/19  15:02
 */
public class StaticFactory {
    public static final int TYPE_APPLE = 1;//苹果
    public static final int TYPE_ORANGE = 2;//橘子
    public static final int TYPE_BANANA = 3;//香蕉

    public static Fruit getFruit(int FruitType) {
        if (FruitType == TYPE_APPLE) {
            return new Apple();
        } else if (FruitType == TYPE_ORANGE) {
            return new Orange(1, "砂糖橘");
        } else if (FruitType == TYPE_BANANA) {
            return new Banana();
        }
        return null;
    }

    /**
     * 多方法工厂，直接创建特定的类
     */
    public static Fruit getApple() {
        return new Apple();
    }

    public static Fruit getOrange() {
        return new Orange(1, "小橘子");
    }

    public static Fruit getBanana() {
        return new Banana();
    }

}

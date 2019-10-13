package create.factory.fatoryMethod;

import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: FactoryMethodTest
 * @projectName pattern
 * @description: 工厂方法模式测试
 * @date 2019/5/19  15:52
 */
public class FactoryMethodTest {
    private static FruitFactory fruitFactory;

    public static void main(String[] args) {
        //初始化苹果工厂
        fruitFactory = new AppleFactory();
        Fruit apple = fruitFactory.getFruit();
        apple.draw();
        //初始化橘子工厂
        fruitFactory = new OrangeFactory();
        Fruit orange = fruitFactory.getFruit();
        orange.draw();
        //初始化香蕉工厂
        fruitFactory = new BananaFactory();
        Fruit banana = fruitFactory.getFruit();
        banana.draw();
    }
}

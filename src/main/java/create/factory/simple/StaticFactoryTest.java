package create.factory.simple;

import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: StaticFactoryTest
 * @projectName pattern
 * @description: 测试简单工厂模式
 * @date 2019/5/19  15:02
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        //1
        Fruit apple = StaticFactory.getFruit(StaticFactory.TYPE_APPLE);
        apple.draw();
        Fruit orange = StaticFactory.getFruit(StaticFactory.TYPE_ORANGE);
        orange.draw();
        Fruit banana = StaticFactory.getFruit(StaticFactory.TYPE_BANANA);
        banana.draw();

        //2
        Fruit apple1 = StaticFactory.getApple();
        apple1.draw();
        Fruit orange1 = StaticFactory.getOrange();
        orange1.draw();
        Fruit banana1 = StaticFactory.getBanana();
        banana1.draw();
    }

}

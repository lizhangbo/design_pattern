package create.factory.fatoryMethod;

import create.factory.product.Bag;
import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: FruitStoreTest
 * @projectName pattern
 * @description: 包装测试
 * @date 2019/7/28  18:50
 */
public class FruitStoreTest {
    private static FruitFactory fruitFactory;
    private static BagFactory bagFactory;

    public static void main(String[] args) {
        pack();
    }

    /**
     * @Description:邮寄打包
     * @Param: []
     * @Return: void
     * @Author: lizhangbo
     * @Date: 2019/7/28 18:50
     */
    private static void pack() {
        //初始化苹果工厂
        fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

        //初始化苹果包装工厂
        bagFactory = new AppleBagFactory();
        Bag bag = bagFactory.getBag();
        bag.pack(fruit);

        //....邮寄业务

    }

}

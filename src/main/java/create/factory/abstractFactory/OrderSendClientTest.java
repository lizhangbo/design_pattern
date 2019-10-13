package create.factory.abstractFactory;

import create.factory.product.Bag;
import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: OrderSendClientTest
 * @projectName pattern
 * @description: 抽象工厂模式测试, 按订单发送货品给客户
 * @date 2019/7/28  18:02
 */
public class OrderSendClientTest {
    public static void main(String[] args) {
        sendFruit();
    }

    private static void sendFruit() {
        //初始化工厂
        AbstractFactory factory = new BananaFactory();//spring 使用注解方式

        //得到水果
        Fruit fruit = factory.getFruit();
        //得到包装
        Bag bag = factory.getBag();
        //打包
        bag.pack(fruit);

        //以下物流运输业务。。。。

    }
}

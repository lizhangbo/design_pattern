package create.builder;

import create.factory.product.fruit.Apple;
import create.factory.product.fruit.Banana;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title: HolidayBuilder
 * @projectName pattern
 * @description: 假期类建造者
 * @date 2019/8/4  13:43
 */
public class HolidayBuilder implements Builder {
    private FruitMeal fruitMeal = new FruitMeal();

    public void buildApple(int price) {
        Apple apple = new Apple();
        apple.setPrice(price);
        fruitMeal.setApple(apple);
    }

    public void buildBanana(int price) {
        Banana banana = new Banana();
        banana.setPrice(price);
        fruitMeal.setBanana(banana);
    }

    public void buildOrange(int price) {
        Orange orange = new Orange(80, "hello,builder");
        orange.setPrice(price);
        fruitMeal.setOrange(orange);
    }

    public FruitMeal getFruitMeal() {
        fruitMeal.setDiscount(15);////折扣价格对一个套餐来，是固定的
        fruitMeal.init();//计算总价
        return fruitMeal;
    }
}

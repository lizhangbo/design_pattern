package create.builder;

import create.factory.product.fruit.Apple;
import create.factory.product.fruit.Banana;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title: FruitMeal
 * @projectName pattern
 * @description: 创建一个水果套餐Meal类
 * @date 2019/8/4  13:34
 */
public class FruitMeal {
    private Apple apple;//苹果-价格
    private Banana banana;//香蕉-价格
    private Orange orange;//橘子-价格
    private int discount;//折扣价
    private int totalPrice;//套餐总价

    public void init() {
        if (null != apple) {
            totalPrice += apple.price();
        }
        if (null != banana) {
            totalPrice += banana.price();
        }
        if (null != orange) {
            totalPrice += orange.price();
        }
        if (totalPrice > 0) {
            totalPrice -= discount;//减去折扣
        }
    }

    public void showItems() {
        System.out.println("totalPrice：" + totalPrice);
    }

    public int cost() {
        return this.totalPrice;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }
}

package create.factory.product.fruit;

import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: Apple
 * @projectName pattern
 * @description: 苹果
 * @date 2019/5/19  15:09
 */
public class Apple implements Fruit {
    private int price = 100;

    public void draw() {
        System.out.println("苹果品种：红富士");
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

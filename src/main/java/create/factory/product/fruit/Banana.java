package create.factory.product.fruit;

import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: Banana
 * @projectName pattern
 * @description: 香蕉
 * @date 2019/5/19  15:20
 */
public class Banana implements Fruit {
    private int price = 60;

    public void draw() {
        System.out.println("香蕉品种：仙人蕉");
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

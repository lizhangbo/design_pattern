package create.factory.product.fruit;

import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: Orange
 * @projectName pattern
 * @description: 橘子
 * @date 2019/5/19  15:10
 */
public class Orange implements Fruit {
    private int price = 60;

    private int a;
    private String Varieties;//品种

    public Orange(int a, String varieties) {
        this.a = a;
        Varieties = varieties;
    }

    public void draw() {
        System.out.println("橘子号：" + a + "--" + "橘子品种：" + Varieties);
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

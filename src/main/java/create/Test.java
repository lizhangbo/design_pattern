package create;

import create.factory.product.Fruit;
import create.factory.product.fruit.Apple;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title:
 * @projectName pattern
 * @description: 自己栽，自己摘,最原始的模式
 * @date 2019/5/19  15:01
 */
public class Test {
    //Peter自己吃水果
    public static void main(String[] args) {
        peterdo();
        jamesdo();
        lisondo();
    }

    //Peter自己吃水果
    public static void peterdo() {
        Fruit fruit = new Apple();
        fruit.draw();
        //。。。直接啃着吃，吃掉了
        System.out.println("-----------------");
    }

    //送给james，切开吃
    public static void jamesdo() {
        Fruit fruit = new Apple();
        fruit.draw();
        //。。。切开吃
        System.out.println("-----------------");
    }

    //送给lison榨汁喝
    public static void lisondo() {
        Fruit fruit = new Orange(100, "peter");
        fruit.draw();
        //。。。榨汁运作
        System.out.println("-----------------");
    }

}

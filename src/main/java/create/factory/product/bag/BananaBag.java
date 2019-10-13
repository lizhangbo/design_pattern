package create.factory.product.bag;

import create.factory.product.Bag;
import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: BananaBag
 * @projectName pattern
 * @description: 香蕉包装
 * @date 2019/7/28  18:40
 */
public class BananaBag implements Bag {
    public void pack(Fruit fruit) {
        System.out.print("--香蕉使用竹萝包装");
    }
}

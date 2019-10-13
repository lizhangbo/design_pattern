package create.factory.product.bag;

import create.factory.product.Bag;
import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: OrangeBag
 * @projectName pattern
 * @description: 桔子包装
 * @date 2019/7/28  18:40
 */
public class OrangeBag implements Bag {
    public void pack(Fruit fruit) {
        System.out.print("--桔子使用网兜包装");
    }
}

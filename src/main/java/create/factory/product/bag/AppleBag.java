package create.factory.product.bag;

import create.factory.product.Bag;
import create.factory.product.Fruit;

/**
 * @author lizhangbo
 * @title: AppleBag
 * @projectName pattern
 * @description: 苹果包装
 * @date 2019/7/28  18:40
 */
public class AppleBag implements Bag {
    public void pack(Fruit fruit) {
        System.out.print("--苹果使用纸箱包装");
    }
}

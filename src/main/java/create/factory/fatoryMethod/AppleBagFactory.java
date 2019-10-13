package create.factory.fatoryMethod;

import create.factory.product.Bag;
import create.factory.product.bag.AppleBag;

/**
 * @author lizhangbo
 * @title: AppleBagFactory
 * @projectName pattern
 * @description: 工厂方法模式,苹果包装工厂
 * @date 2019/7/28  18:47
 */
public class AppleBagFactory implements BagFactory {
    public Bag getBag() {
        return new AppleBag();
    }
}

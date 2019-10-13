package create.factory.fatoryMethod;

import create.factory.product.Bag;
import create.factory.product.bag.BananaBag;

/**
 * @author lizhangbo
 * @title: BananaBagFactory
 * @projectName pattern
 * @description: 工厂方法模式，香蕉包装工厂
 * @date 2019/7/28  18:47
 */
public class BananaBagFactory implements BagFactory {
    public Bag getBag() {
        return new BananaBag();
    }
}

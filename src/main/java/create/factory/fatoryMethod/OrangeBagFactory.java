package create.factory.fatoryMethod;

import create.factory.product.Bag;
import create.factory.product.bag.OrangeBag;

/**
 * @author lizhangbo
 * @title: OrangeBagFactory
 * @projectName pattern
 * @description: TODO
 * @date 2019/7/28  18:48
 */
public class OrangeBagFactory implements BagFactory {
    public Bag getBag() {
        return new OrangeBag();
    }
}

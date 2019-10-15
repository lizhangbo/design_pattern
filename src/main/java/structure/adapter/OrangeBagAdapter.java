package structure.adapter;

import create.factory.product.Fruit;
import create.factory.product.bag.AppleBag;
import create.factory.product.bag.OrangeBag;

/**
 * @author lizhangbo
 * @title: OrangeBagAdapter
 * @projectName pattern
 * @description: 桔子包装适配器,此模式的目的为合并
 * @date 2019/8/4  18:45
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

    public OrangeBagAdapter(AppleBag appleBag) {
        this.appleBag = appleBag;
    }

    @Override
    public void pack(Fruit fruit) {
        appleBag.pack(fruit);
    }
}

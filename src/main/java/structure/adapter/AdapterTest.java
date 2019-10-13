package structure.adapter;

import create.factory.product.bag.AppleBag;
import create.factory.product.bag.OrangeBag;
import create.factory.product.fruit.Orange;

/**
 * @author lizhangbo
 * @title: AdapterTest
 * @projectName pattern
 * @description: 测试适配器模式
 * @date 2019/8/4  18:46
 */
public class AdapterTest {
    public static void main(String[] args) {
        Orange orange = new Orange(10, "lzb");
        OrangeBag bag = getBag2();
        bag.pack(orange);

    }

    private static OrangeBag getBag() {
        OrangeBag bag = new OrangeBag();
        return bag;
    }

    public static OrangeBag getBag2() {
        //准备用苹果包装代替
        AppleBag appleBag = new AppleBag();
        //把苹果盒适配成桔子包装盒
        OrangeBag orangeBag = new OrangeBagAdapter(appleBag);
        return orangeBag;
    }
}

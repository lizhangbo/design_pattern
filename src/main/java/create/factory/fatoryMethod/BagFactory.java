package create.factory.fatoryMethod;

import create.factory.product.Bag;

/**
 * @author lizhangbo
 * @title: BagFactory
 * @projectName pattern
 * @description: 工厂方法模式
 * @date 2019/7/28  18:46
 */
public interface BagFactory {
    public Bag getBag();//打包指令
}

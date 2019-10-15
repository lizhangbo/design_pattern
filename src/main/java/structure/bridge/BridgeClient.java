package structure.bridge;

import structure.bridge.bag.BagAbstraction;
import structure.bridge.bag.BigBag;
import structure.bridge.bag.MiniBag;
import structure.bridge.material.Material;
import structure.bridge.material.Paper;
import structure.bridge.material.Plastic;

/**
 * @author lizhangbo
 * @title: BridgeClient
 * @projectName design_pattern
 * @description: 测试类, 桥接模式, 此模式的目的为合并
 * @date 2019/10/15  22:52
 */
public class BridgeClient {
    public static void main(String[] args) {
        //例子1:
        //袋子型号
        BagAbstraction bag1 = new BigBag();//大袋

        //袋子材质
        Material material1 = new Paper();//纸盒
        bag1.setMaterial(material1);

        //采摘
        bag1.pack();
        //例子2:
        //袋子型号
        BagAbstraction bag2 = new MiniBag();//迷你袋

        //袋子材质
        Material material2 = new Plastic();//塑料
        bag2.setMaterial(material2);

        //采摘
        bag2.pack();
    }
}

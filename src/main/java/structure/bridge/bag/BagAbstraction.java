package structure.bridge.bag;

import structure.bridge.material.Material;

/**
 * @author lizhangbo
 * @title: BagAbstraction
 * @projectName design_pattern
 * @description: 包裹大小抽象类，使用桥接模式
 * @date 2019/10/15  23:03
 */
public abstract class BagAbstraction {
    //桥接进来
    protected Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }

    //采摘
    public abstract void pack();
}

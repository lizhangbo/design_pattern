package structure.bridge.bag;

/**
 * @author lizhangbo
 * @title: BigBag
 * @projectName design_pattern
 * @description: 大袋
 * @date 2019/10/15  23:04
 */
public class BigBag extends BagAbstraction {
    @Override
    public void pack() {
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一大袋");
    }
}

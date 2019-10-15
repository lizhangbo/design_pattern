package structure.bridge.bag;

/**
 * @author lizhangbo
 * @title: SmallBag
 * @projectName design_pattern
 * @description: 小袋
 * @date 2019/10/15  23:04
 */
public class SmallBag extends BagAbstraction {
    @Override
    public void pack() {
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一小袋");
    }
}

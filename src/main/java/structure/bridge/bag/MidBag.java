package structure.bridge.bag;

/**
 * @author lizhangbo
 * @title: MidBag
 * @projectName design_pattern
 * @description: 中型袋
 * @date 2019/10/15  23:04
 */
public class MidBag extends BagAbstraction {
    @Override
    public void pack() {
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一中型袋");
    }
}

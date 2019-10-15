package structure.bridge.bag;

/**
 * @author lizhangbo
 * @title: MiniBag
 * @projectName design_pattern
 * @description: 迷你袋
 * @date 2019/10/15  23:04
 */
public class MiniBag extends BagAbstraction {
    @Override
    public void pack() {
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一迷你袋");
    }
}

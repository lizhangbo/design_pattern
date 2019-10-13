package create.singleton;


/**
 * 懒汉式-双重检查
 * Double CheckLock(DCL)模式(即双重检查)
 * 优点：第一次执行getInstance时instance才被实例化，节省内存；多线程情况下，
 * 基本安全；并且在instance实例化以后，再次调用getInstance时，不会有同步消耗。
 * 缺点：jdk1.5以下，有可能DCL失效；Java内存模型影响导致失效；jdk1.5以后，使用volatile关键字，
 * 虽然能解决DCL失效问题，但是会影响部分性能。
 */
public class SingleDcl {
    private int a;
    private volatile static SingleDcl singleDcl;

    //私有化
    private SingleDcl() {
    }

    public static SingleDcl getInstance() {
        if (singleDcl == null) { //第一次检查，不加锁
            System.out.println(Thread.currentThread() + " is null");
            synchronized (SingleDcl.class) { //加锁
                if (singleDcl == null) { //第二次检查，加锁情况下
                    System.out.println(Thread.currentThread() + " is null");
                    //内存中分配空间  1
                    //空间初始化 2
                    //把这个空间的地址给我们的引用  3
                    singleDcl = new SingleDcl();
                }
            }
        }
        return singleDcl;
    }
}

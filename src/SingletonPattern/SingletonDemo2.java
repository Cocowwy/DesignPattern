package SingletonPattern;

/**
 * 单例模式
 * 懒汉式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 *
 * @author Cocowwy
 * @create 2020-09-09-11:09
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;

    public SingletonDemo2() {
    }

    public static SingletonDemo2 getInstance() {
        if (null == instance) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}

class SingletonDemoMain2{
    public static void main(String[] args) {
        System.out.println(SingletonDemo2.getInstance());
    }
}
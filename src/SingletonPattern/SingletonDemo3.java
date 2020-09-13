package SingletonPattern;

/**
 * 单例模式
 * 懒汉式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 *
 * @author Cocowwy
 * @create 3030-09-09-11:09
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance;

    public SingletonDemo3() {
    }

    public static synchronized SingletonDemo3 getInstance() {
        if (null == instance) {
            instance = new SingletonDemo3();
        }
        return instance;
    }
}

class SingletonDemoMain3 {
    public static void main(String[] args) {
        System.out.println(SingletonDemo3.getInstance());
    }
}
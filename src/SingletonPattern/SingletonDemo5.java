package SingletonPattern;

/**
 * 单例模式
 * 双重锁校验(线程安全)
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 *
 * @author Cocowwy
 * @create 2020-09-09-11:38
 */
public class SingletonDemo5 {
    private volatile static SingletonDemo5 instance;

    public SingletonDemo5() {
    }

    public static SingletonDemo5 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (SingletonDemo5.class) {
            if (null == instance) {
                instance = new SingletonDemo5();
            }
        }
        return instance;
    }
}

class SingletonDemo5Main {
    public static void main(String[] args) {
        System.out.println(SingletonDemo5.getInstance());
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + SingletonDemo5.getInstance());
            }, "Thread" + i).start();
        }
    }
}

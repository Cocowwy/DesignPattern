package SingletonPattern;

/**
 * 单例模式
 * 静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 使⽤类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的⽅
 * 式耗费性能。
 *
 * @author Cocowwy
 * @create 2020-09-09-11:27
 */
public class SingletonDemo4 {
    private static class SingletonDemo4Holder {
        private static SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4() {
    }

    public static SingletonDemo4 getInstance() {
        return SingletonDemo4Holder.instance;
    }
}

class SingletonDemo4Main{
    public static void main(String[] args) {
        System.out.println(SingletonDemo4.getInstance());
    }
}
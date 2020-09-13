package SingletonPattern;

/**
 * 单例模式
 * 饿汉式
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 *
 * @author Cocowwy
 * @create 2020-09-09-10:57
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }
}

class SingletonDemo1Main {
    public static void main(String[] args) {
        //只能通过静态方法拿到 而不能通过私有化的构造器拿
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        System.out.println(instance);
    }
}

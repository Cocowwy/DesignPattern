package FactoryPattern;

/**
 * 工厂模式 测试 Demo
 *
 * @author Cocowwy
 * @create 2020-09-09-11:28
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("------开始插入数据------");

        ActionFactory actionFactory = new ActionFactory();
        Action mysql = actionFactory.getInsert("mysql");
        Action redis = actionFactory.getInsert("redis");

        mysql.insert("Coco", "传入的mysql");
        redis.insert("Coco", "传入的redis");

        System.out.println("------结束插入数据------");
    }
}

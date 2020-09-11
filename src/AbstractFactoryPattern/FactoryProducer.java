package AbstractFactoryPattern;

/**
 * 创建一个工厂创造器/生成器类
 *
 * @author Cocowwy
 * @create 2020-09-09-15:36
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equals("eat")) {
            return new FoodFactory();
        } else if (choice.equals("drink")) {
            return new DrinkFactory();
        }
        return null;
    }
}

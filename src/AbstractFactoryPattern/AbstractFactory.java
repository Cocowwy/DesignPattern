package AbstractFactoryPattern;

/**
 * Drink和Food的抽象工厂
 *
 * @author Cocowwy
 * @create 2020-09-09-15:16
 */
public abstract class AbstractFactory {
    public abstract Drink getDrink(String drink);
    public abstract Food getFood(String food);
}

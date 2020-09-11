package AbstractFactoryPattern;

/**
 * Drink的工厂
 *
 * @author Cocowwy
 * @create 2020-09-09-15:18
 */
public class DrinkFactory extends AbstractFactory {
    @Override
    public Drink getDrink(String drink) {
        if (drink.equals("juice")) {
            return new juice();
        } else if (drink.equals("coke")) {
            return new coke();
        }
        return null;
    }

    @Override
    public Food getFood(String food) {
        return null;
    }
}

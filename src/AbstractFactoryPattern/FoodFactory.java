package AbstractFactoryPattern;

/**
 * Food的工厂
 *
 * @author Cocowwy
 * @create 2020-09-09-15:32
 */
public class FoodFactory extends AbstractFactory {

    @Override
    public Drink getDrink(String drink) {
        return null;
    }

    @Override
    public Food getFood(String food) {
        if (food.equals("banana")) {
            return new banana();
        } else if (food.equals("tomato")) {
            return new tomato();
        }
        return new tomato();
    }
}

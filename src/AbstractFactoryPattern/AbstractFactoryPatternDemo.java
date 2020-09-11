package AbstractFactoryPattern;

/**
 * 抽象工厂模式测试 Demo
 *
 * @author Cocowwy
 * @create 2020-09-09-15:40
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory foodFactory = FactoryProducer.getFactory("drink");
        Drink coke = foodFactory.getDrink("coke");
        coke.drink();
        Drink juice = foodFactory.getDrink("juice");
        juice.drink();

        AbstractFactory drinkFactory = FactoryProducer.getFactory("eat");
        Food banana = drinkFactory.getFood("banana");
        banana.eat();
        Food tomato = drinkFactory.getFood("tomato");
        tomato.eat();
    }
}

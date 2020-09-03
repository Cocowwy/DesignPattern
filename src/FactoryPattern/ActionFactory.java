package FactoryPattern;

/**
 * @author Cocowwy
 * @create 2020-09-09-12:26
 */
public class ActionFactory {
    public Action getInsert(String type) {
        if (type == "mysql") {
            return new mysql();
        } else if (type == "redis") {
            return new redis();
        }

        return null;
    }
}

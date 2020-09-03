package FactoryPattern;

/**
 * 模拟 向redis缓存中插数据
 *
 * @author Cocowwy
 * @create 2020-09-09-11:52
 */
public class redis implements Action {
    @Override
    public void insert(String key, String value) {
        System.out.println("向Redis数据库中插入key为" + key + " value为" + value + "的数据");
    }
}

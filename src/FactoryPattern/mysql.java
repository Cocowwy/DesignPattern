package FactoryPattern;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * 模拟 向mysql数据库中查数据
 * @author Cocowwy
 * @create 2020-09-09-11:53
 */
public class mysql implements Action {
    @Override
    public void insert(String key, String value) {
        System.out.println("向MySQL数据库中插入key为" + key + " value为" + value + "的数据");
    }
}

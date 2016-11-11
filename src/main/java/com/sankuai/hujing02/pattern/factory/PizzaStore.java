package com.sankuai.hujing02.pattern.factory;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/25 下午6:50
 * Description:
 */

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

package com.sankuai.hujing02.pattern.factory;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/25 下午6:55
 * Description:
 */

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        cheese = ingredientFactory.createCheese();
    }
}

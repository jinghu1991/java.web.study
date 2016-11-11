package com.sankuai.hujing02.pattern.factory;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/25 下午7:05
 * Description:
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

}

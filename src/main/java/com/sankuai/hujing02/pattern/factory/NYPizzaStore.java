package com.sankuai.hujing02.pattern.factory;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/25 下午6:54
 * Description:
 */

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}

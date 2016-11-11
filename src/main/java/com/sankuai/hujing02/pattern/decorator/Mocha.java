package com.sankuai.hujing02.pattern.decorator;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/19 下午2:44
 * Description:
 */

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.1 + getBeverage().cost();
    }

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        Whip whip = new Whip(darkRoast);

        Mocha mocha = new Mocha(whip);

        System.out.println(mocha.cost());
    }
}

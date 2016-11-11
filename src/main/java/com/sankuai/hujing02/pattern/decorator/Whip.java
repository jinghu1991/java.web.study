package com.sankuai.hujing02.pattern.decorator;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/19 下午2:19
 * Description:
 */

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.2 + getBeverage().cost();
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        Whip whip = new Whip(darkRoast);
        System.out.println(whip.cost());
    }
}

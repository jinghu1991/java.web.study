package com.sankuai.hujing02.pattern.decorator;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/19 下午2:18
 * Description:
 */

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}

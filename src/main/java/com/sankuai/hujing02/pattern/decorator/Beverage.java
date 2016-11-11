package com.sankuai.hujing02.pattern.decorator;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/19 下午2:15
 * Description:
 */

public abstract class Beverage {
    private String description = "Unknown beverage";

    private int size;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

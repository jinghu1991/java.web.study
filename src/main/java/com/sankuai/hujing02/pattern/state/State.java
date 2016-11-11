package com.sankuai.hujing02.pattern.state;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/1 下午4:20
 * Description:
 */

public interface State {
    public void insertQuarter(GumballMachine gumballMachine);
    public void ejectQuarter(GumballMachine gumballMachine);
    public void turnCrank(GumballMachine gumballMachine);
    public void dispense(GumballMachine gumballMachine);

    public void refill(GumballMachine gumballMachine);
}

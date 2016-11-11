package com.sankuai.hujing02.pattern.state;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/1 下午4:23
 * Description:
 */

public class NoQuarterState implements State {

    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense(GumballMachine gumballMachine) {
        System.out.println("You need to pay first");
    }

    public void refill(GumballMachine gumballMachine) { }

    public String toString() {
        return "waiting for quarter";
    }
}
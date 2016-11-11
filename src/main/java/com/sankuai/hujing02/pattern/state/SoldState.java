package com.sankuai.hujing02.pattern.state;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/1 下午4:21
 * Description:
 */

public class SoldState implements State {

    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense(GumballMachine gumballMachine) {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill(GumballMachine gumballMachine) { }

    public String toString() {
        return "dispensing a gumball";
    }
}

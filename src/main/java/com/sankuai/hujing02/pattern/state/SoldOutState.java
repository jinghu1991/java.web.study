package com.sankuai.hujing02.pattern.state;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/1 下午4:23
 * Description:
 */

public class SoldOutState implements State {

    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense(GumballMachine gumballMachine) {
        System.out.println("No gumball dispensed");
    }

    public void refill(GumballMachine gumballMachine) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "sold out";
    }
}
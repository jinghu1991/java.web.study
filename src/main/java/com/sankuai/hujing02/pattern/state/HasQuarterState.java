package com.sankuai.hujing02.pattern.state;

import java.util.Random;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/1 下午4:22
 * Description:
 */

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());

    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense(GumballMachine gumballMachine) {
        System.out.println("No gumball dispensed");
    }

    public void refill(GumballMachine gumballMachine) { }

    public String toString() {
        return "waiting for turn of crank";
    }
}

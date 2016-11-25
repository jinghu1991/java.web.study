package com.sankuai.hujing02.jvm.box;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/22 下午1:19
 * Description:
 */

public class BoxingTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);//true
        System.out.println(e == f);//false
        System.out.println(c == (a + b));//false
        System.out.println(c.equals(a + b));//true
        System.out.println(g == (a + b));//false
        System.out.println(g.equals(a + b));//true
    }
}

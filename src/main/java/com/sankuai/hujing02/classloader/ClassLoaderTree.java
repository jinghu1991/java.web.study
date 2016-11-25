package com.sankuai.hujing02.classloader;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/11/12 下午5:39
 * Description:
 */

public class ClassLoaderTree {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
}

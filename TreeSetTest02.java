package edu.xcdq.set;

import java.util.TreeSet;

/**
 * @author xujinwei
 * @date 2021/5/6 11:27
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add(111);
        set.add(222);
        set.add(333);
        System.out.println(set);
    }
}

package edu.xcdq.set;

import java.util.HashSet;

/**
 * @author xujinwei
 * @date 2021/5/6 11:14
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet<Object> set01 = new HashSet<>();//默认长度16  负载因子75%
        set01.add("aaa");
        set01.add("bbb");
        set01.add("ccc");
        set01.add(111);
        set01.add(222);
        set01.add(333);
        for (Object e : set01){
            System.out.print(e+"\t");
        }
    }
}

package com.chen;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: datastructures
 * @description:
 * @author: 陈达运
 * @create: 2021-05-15 17:12
 **/
public class StrTest {

    static final int LOOP_COUNT = 10_000;
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();

        test();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < LOOP_COUNT; i++) {

            list.addLast(i);
        }
        //System.out.println(list);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime -beginTime);
    }

    public static void test() {
        String patter = "^[0-9]{2}";
        Pattern pattern = Pattern.compile(patter);
        String str = "54陈达运7677";
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}

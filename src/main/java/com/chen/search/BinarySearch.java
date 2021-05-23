package com.chen.search;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: datastructure
 * @description:
 * @author: 陈达运
 * @create: 2021-05-13 22:30
 **/
public class BinarySearch {
    public static void main(String[] args) {

        int sum = 1;
        int base = 5;
        int power = 2;

        while (power > 0) {
            if ((power & 1) == 1) {
                sum = sum * base % 1000;
            }
            power >>= 1;
            base = base * base % 1000;
        }
        System.out.println(sum % 1000);
    }

    @Test
    public void test01() {
        int a = 100000000;
        int b = 7;
        int sum = 0;
        while (a > 0) {
            if ((a & 1) == 1) {
            sum+=b;
            }
            a>>=1;
            b=b+b;
        }
        System.out.println(sum);
    }

    @Test
    public  void test02(){
        int dividend =-2147483648;
        int divisor=-1;

        int res=0;
        int flag=0;


        if (dividend < 0) {
            dividend=-dividend;
            System.out.println(dividend);
            flag^=1;
        }
        if (divisor < 0) {
            divisor=-divisor;
            flag^=1;
        }

        while (dividend > divisor)
        {
            dividend-=divisor;
            res++;
            if (res==Integer.MAX_VALUE){
                break;
            }
        }
        res=flag==1?-res:res;
        System.out.println(Integer.toBinaryString(res));
        System.out.println(res);
    }
}

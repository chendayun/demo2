package com.chen.sort;

import java.util.Arrays;

/**
 * @program: datastructure
 * @description:
 * @author: 陈达运
 * @create: 2021-05-14 18:34
 **/
public class QuickSort {

    public static void main(String[] args) {
        //int[] arr = {54, 67, 7, 878, 90, 89};
        int[] arr = {9, 8, 7, 6, 5, 47878, 3, 2, 1};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low, j = high, index = array[i]; // 取最左边的数作为基准数
        while (i < j) {
            while (i < j && array[j] >= index) { // 向左寻找第一个小于index的数
                j--;
            }
            if (i < j) {
                array[i++] = array[j]; // 将array[j]填入array[i]，并将i向右移动
                System.out.println(Arrays.toString(array));
            }
            while (i < j && array[i] < index) {// 向右寻找第一个大于index的数
                i++;
            }
            if (i < j) {
                array[j--] = array[i]; // 将array[i]填入array[j]，并将j向左移动
                System.out.println(Arrays.toString(array));

            }
        }
        array[i] = index; // 将基准数填入最后的坑
        System.out.println(Arrays.toString(array));
        System.out.println("index==" + index);
        quickSort(array, low, i - 1); // 递归调用，分治
        quickSort(array, i + 1, high); // 递归调用，分治
    }

    public static void quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }
}

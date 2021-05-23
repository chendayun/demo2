package com.chen.sort;

import java.util.Arrays;

/**
 * @program: datastructure
 * @description:
 * @author: 陈达运
 * @create: 2021-05-14 19:06
 **/
public class QuickSort2 {

    public static void main(String[] args) {
        int[] arr = new int[1_000];
        int j =1_000;
        for (int i = 0; i < 1_000; i++) {
            arr[i] =j;
            j--;
        }
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int index = array[i];
        while (i < j) {
            while (i < j && array[j] >= index) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];
            }

            while (i < j && array[i] < index) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];
            }
        }
        array[i] = index;
        quickSort(array, low, i - 1);
        quickSort(array, i + 1, high);
    }
}

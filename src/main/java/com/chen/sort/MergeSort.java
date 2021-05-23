package com.chen.sort;

import java.util.Arrays;

/**
 * @program: datastructure
 * @description:
 * @author: 陈达运
 * @create: 2021-05-14 16:48
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(arr, 0, arr.length - 1, temp);
    }

    private static void sort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2; // mid =0
            sort(arr, left, mid, temp);//左边归并排序，使得左子序列有序  0,0
            sort(arr, mid + 1, right, temp);//右边归并排序，使得右子序列有序 1,1
            merge(arr, left, mid, right, temp);//将两个有序子数组合并操作 0,0,1
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;//左序列指针 0
        int j = mid + 1;//右序列指针 1=0+1
        int t = 0;//临时数组指针
        while (i <= mid && j <= right) {       //0,0, 1,1
            if (arr[i] <= arr[j]) {    //9 8
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];    //temp[0] = 8
            }
        }
        while (i <= mid) {//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];   //t[1]=a[0]   t[2] t[
        }
        while (j <= right) {//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
package com.algorithm.sort;

/**
 * @ClassName InsertSort
 * @Description //TODO
 * @Author crazy402
 * @Date 2020/9/7 17:22
 * @Version 1.0
 *
 * 插入排序
 **/
public class InsertSort {
    public static void sort (int[] arr) {
        if (arr.length >= 2) {
            for (int i = 0; i < arr.length; i++) {
                //挖出一个要排序的值，同时位置上留下一个存新值的地址
                int x = arr[i];
                int y = i - 1;
                //再前面一个或者连续多个值比x大时一直循环找知道将x插入为止
                while (y >=0 && arr[y] >x) {
                    arr[y + 1] = arr[y];
                    y--;
                }
                //将x插入到最前面
                arr[y + 1] = x;
            }
        }
    }
}

package com.algorithm.sort;

/**
 * @ClassName bubbleSort
 * @Description //TODO
 * @Author crazy402
 * @Date 2020/9/7 17:03
 * @Version 1.0
 *
 *
 *
 **/
public class bubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}

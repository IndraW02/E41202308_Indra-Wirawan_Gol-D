package com;

import java.util.Arrays;

/**
 *
 * @author Indra WIrawan
 */
public class SequentialSearch {

    static void ss(int[] arr, int search) {
        int f_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                f_index = i;
            }
        }
        System.out.println("Data berada pada index : " + f_index);
    }

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(number);
        ss(number, 7);

    }
}



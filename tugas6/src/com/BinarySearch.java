package com;

import java.util.Arrays;

/**
 *
 * @author Indra WIrawan
 */
public class BinarySearch {

    public static void bs(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        Arrays.sort(number);
        int target = 8;
        int last = number.length - 1;
        bs(number, 0, last, target);

    }
}


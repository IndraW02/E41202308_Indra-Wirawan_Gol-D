package com;

/**
 *
 * @author Indra WIrawan
 */
public class SelectionSort {

    static void ss(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            // mencari nilai terkecil
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int n_kecil = arr[index];
            arr[index] = arr[i];
            arr[i] = n_kecil;
        }
    }

    // lebih simpel
    static void ss2(int[] arr) {
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j]; // swap
                    arr[j] = temp;
                    swap = true;
                    if (swap) {
                        swap_count++;
                    }
                }
            }
        }
        
        System.out.print("Array setelah disorting : [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.println("Jumlah perbandingan : " + swap_count);
    }
    
    // show
    static void show(int[] arr) {
        System.out.print("Array sebelum disorting : [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] number = {2, 5, 3, 6, 8, 3, 1};
        show(number);
        ss2(number);
    }
}

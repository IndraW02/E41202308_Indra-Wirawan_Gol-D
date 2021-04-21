/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import static sorting.bubblesort.bubbleSort;
import static sorting.print.printArray;

/**
 *
 * @author Indra WIrawan
 */
public class main {
    public static void main(String[] args)
	{  
		int arr[] ={9, 3, 8, 4, 6};  
 
		System.out.println("---Array BEFORE Bubble Sort---"); 
		
	    printArray(arr);
 
		bubbleSort(arr);//sorting array elements using bubble sort  
 
		System.out.println("---Array AFTER Bubble Sort---");  
		
		printArray(arr); 
 
	}  
}

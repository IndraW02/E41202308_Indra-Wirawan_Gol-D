/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import static sorting.print.printArray;


/**
 *
 * @author Indra Wirawan
 */
public class bubblesort {
    static void bubbleSort(int[] array)
	{  
		int n = array.length;  
		int temp = 0;  
		for(int i=0; i < n; i++) // Looping through the array length
		{  System.out.println("Urutkan Nomor "+(i+1)); 
			for(int j=1; j < (n-i); j++)
			{  
			    System.out.println("Membandingkan "+ array[j-1]+ " and " + array[j]);    
				if(array[j-1] > array[j])
				{   
				    
					//swap elements  
					temp = array[j-1];  
					array[j-1] = array[j];  
					array[j] = temp;  
				    System.out.println(array[j]  + " > " + array[j-1]);
				    System.out.println("Menukar elemen: Array baru setelah ditukar");
					printArray(array);
				}  
 
			}  
		}  
 
	} 
}

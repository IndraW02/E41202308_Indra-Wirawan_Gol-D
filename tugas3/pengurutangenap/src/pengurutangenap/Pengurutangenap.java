/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengurutangenap;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Pengurutangenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Angka :");
        int jmlAngka = input.nextInt();
        int[]arr = new int[jmlAngka];
        System.out.println("Masukkan Semua Angka :");
 
        for(int i=0;i <jmlAngka;i++){
         arr[i] =input.nextInt();
     }
 
     Arrays.sort(arr);
     for(int index:arr){
         System.out.println("Telah diurutkan :"+index);
     }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5b;

/**
 *
 * @author Indra Wirawan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        System.out.println("Bilangan kelipatan 2 (0-100)");
        
        System.out.println("============================");
        int i = 0;
        do{
            if(i==0){
            i = 0;            
        }
            else{
                System.out.print(i*2 + " ");
            }
            i++;
        }
        while(i<=100);
    
    }
    
}

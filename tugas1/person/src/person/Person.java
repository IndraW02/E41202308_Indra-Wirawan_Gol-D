/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Indra Wirawan
 */
import java.util.Scanner;
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("First Name = ");
        String fname = input.next();
        
        System.out.print("Last Name = ");
        String lname = input.next();
        
        System.out.print("Student  ID = ");
        String stuid = input.next();
        
        System.out.print("Student Status = ");
        String stuttatus = input.next();
    }
    
}

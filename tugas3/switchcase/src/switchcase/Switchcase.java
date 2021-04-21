/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;
import java.util.Scanner;
/**
 *
 * @author Indra Wirawan
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.print("Pilihan:\n 1. Nasi Tempong (Rp.12.000.00)\n 2. Sate Kamnbing(Rp.20.000.00)\n 3. Ayam Geprek(Rp.15.000.00)\n");
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan      : Nasi Tempong");
                System.out.println("Harga        : 12.000");
                System.out.println("Jumlah       : "+pesan);
                System.out.println("Total Bayar  : "+pesan*12000);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan      : Sate Kambing");
                System.out.println("Harga        : 20.000");
                System.out.println("Jumlah       : "+pesan);
                System.out.println("Total Bayar  : "+pesan*20000);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan      : Ayam Geprek");
                System.out.println("Harga        : 15.000");
                System.out.println("Jumlah       : "+pesan);
                System.out.println("Total Bayar  : "+pesan*15000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
    
}

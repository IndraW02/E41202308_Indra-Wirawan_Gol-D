/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;
import java.util.Scanner;
/**
 *
 * @author Indra Wirawan
 */
public class Kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println(" ____________________________________");
        System.out.println("|            MENU MAKANAN            |");
        System.out.println("|____________________________________|");
        System.out.println("|  Nama            |  Harga          |");
        System.out.println("|1. Nasi Tempong   |   Rp 10000      |");
        System.out.println("|2. Nasi Pecel     |   Rp 8000       |");
        System.out.println("|3. Ayam Bakar     |   Rp 15000      |");
        System.out.println("|4. Susu           |   Rp 4000       |");
        System.out.println("|5. Es Teh         |   Rp 5000       |");
        System.out.println("|__________________|_________________|");
        System.out.println("");


        int harga = 0;

        int h1 = 10000, h2 = 8000, h3 = 15000, h4 = 4000, h5 = 5000;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");

        System.out.print("Nomor Makanan : ");
        int inNomor = scan.nextInt();
        System.out.print("Banyak Pesanan : ");
        int jumlah = scan.nextInt();
        System.out.println("_____________________________________");

        if (inNomor == 1)
        {

            menu = " Nasi Tempong";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1 * jumlah;
        }
            else if (inNomor == 2)
            {

                menu = " Nasi Pecel";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2 * jumlah;
            }
                else if (inNomor == 3)
                {

                    menu = " Ayam Bakar";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3 * jumlah;
                }
                    else if (inNomor == 4)
                    {

                        menu = " Susu";
                        System.out.println("Pilihan anda nomor " +inNomor + menu);
                        harga = harga + h4 * jumlah;
                    }
                        else if (inNomor == 5)
                        {

                            menu = " Es Teh";
                            System.out.println("Pilihan anda nomor " +inNomor + menu);
                            harga = harga + h5 * jumlah;
                        }
                     else

                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }


            System.out.println("Apakah ada Pesanan lain? Y/T");
            i = scan.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih Cepat Kembali ya.");
    }

}

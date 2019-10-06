/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_08;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class soal_a {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int hrg = 660000;
    int jml ;
    int ttl ;
    
    System.out.print ("Harga satu Printer = 660.000\n");
    
    System.out.print ("Masukkan Jumlah Barang = ");
    jml = input.nextInt();
    ttl = hrg*jml;
   
    System.out.print("Total yang di Bayar = " + ttl);
    
}
}

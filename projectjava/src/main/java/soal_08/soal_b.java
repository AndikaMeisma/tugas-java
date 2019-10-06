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
public class soal_b {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double disc ;
    double hrg = 660000;
    double jml, byr, ttl;
    
    System.out.print("Harga satu Printer = 660000 \n");
    
    System.out.print("Masukkan Jumlah Pembelian = ");
    jml = input.nextDouble();
    byr = jml*hrg;
    //Hitung Diskon 
    if (byr > 15000000) {
        byr = jml*hrg;
        disc = byr*0.15;
        ttl = byr-disc;
        System.out.print("Diskon Yang Diterima = " + disc);
        System.out.print(" \n");
        System.out.print("Total Yang Harus Dibayar = " + ttl);
    }
    else{
        System.out.print("Total Yang Harus Dibayar = " + byr);
        
    }
    
    }
    
    
}

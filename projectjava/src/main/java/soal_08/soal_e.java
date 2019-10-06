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
public class soal_e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int tujuan, ttl ;
        int ongkos_a = 2500;
        int ongkos_b = 4000;
        int jrk_a = 169;
        int jrk_b = 452;
        
        // Tampilkan Daftar Tujuan
        System.out.print("Kota di tuju \n");
        System.out.print("1. Surabaya \n");
        System.out.print("2. Bandung \n");
        // Input Pilihan Tujuan
        System.out.print ("Kota di tuju = ");
        tujuan = input.nextInt();
        // Tampilkan Ongkos Kirim
        switch (tujuan){
        case 1 : System.out.print ("Kota di tuju = Surabaya \n");
                 System.out.print("Jarak Malang-Surabaya = 169km \n");
                 System.out.print("Ongkos Kirim Per Km = Rp. 2500 \n");
                 ttl = jrk_a*ongkos_a;
                 System.out.print("Total Biaya Kirim Ke Surabaya = " + ttl);
                 break;
        case 2 : System.out.print ("Kota Tujuan = Bandung \n");
                 System.out.print("Jarak Malang-Bandung = 452km \n");
                 System.out.print("Ongkos Kirim Per Km = Rp. 4000 \n");
                 ttl = jrk_b*ongkos_b;
                 System.out.print("Total Biaya Kirim Ke Bandung = " + ttl);
                 break;
                 
        }
    }
        
        
        
   
    }
    
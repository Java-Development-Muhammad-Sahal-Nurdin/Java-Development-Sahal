/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Biodata {
    public static void main (String[] args)
    {
        String nama;             // Menyimpan nama
        int umur;                 // Menyimpan umur
        double beratBadan;    // Menyimpan berat badan 
        double tinggiBadan;  // Mentimpan tinggi badan 
        
        //  Object scanner untuk membaca input
        Scanner keyboard =  new Scanner(System.in);
        
        // Meminta nama pengguna 
        System.out.print("Masukkan nama anda: ");
        nama = keyboard.nextLine();
        
        // Meminta umur pengguna
        System.out.print("Masukkan umur anda: ");
        umur = keyboard.nextInt();
        
        // Meminta berat badan pengguna
         System.out.print("Masukkan berat badan anda: ");
         beratBadan = keyboard.nextDouble();
         
         // Meminta berat tinggi badan pengguna
         System.out.print("Masukkan tinggi badan anda: ");
         tinggiBadan = keyboard.nextDouble();
         
         // Menampilkan biodata pengguna 
         System.out.println("Nama: "+ nama );
         System.out.println("Nama: "+ umur + " tahun." );
         System.out.println("Nama: "+ beratBadan + " kg." );
         System.out.println("Nama: "+ tinggiBadan + " cm." );
                 
                
    }
    
}

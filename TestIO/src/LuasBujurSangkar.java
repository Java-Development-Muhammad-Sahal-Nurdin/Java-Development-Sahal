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
public class LuasBujurSangkar {
    public static void main (String[] args)
    {
        int sisi; // Menyimpan input sisi bujur sangkar dari pengguna
        int luas; // Luas bujur sangkar 
        
        // Buat objek scanner untuk membaca input dari keyboard pengguna
        Scanner keyboard = new Scanner(System.in);
        
        //Menampilkan prompt ke pengguna untuk memasukkan input sisi
        System.out.println("Masukkan sisi(cm): ");
        
        // Baca input pengguna berupa integer dan disimpan ke sisi
        sisi = keyboard.nextInt();
        
        //Hitung luas bujur sangkar
        luas = sisi * sisi;
        
        // Menampilkan luas bujur sangkar
        System.out.println("Luas bujur sangkar adalah " + luas + " cm2.");
    }
    
}

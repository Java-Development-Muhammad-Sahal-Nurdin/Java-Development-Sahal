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
public class KelulusanUjian 
{
    public static void main(String[] args)
    {
        double skor1; // Untuk menyimpan skor ujian ke-1
        double skor2; // Untuk menyimpan skor ujian ke-2
        double skor3; // Untuk menyimpan skor ujian ke-3
        double rerata; // Untuk menyimpan rerata skor ujian
        
        // Buat objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Minta skor 1
        System.out.println("Maukkan skor ujian 1: ");
        skor1 = keyboard.nextDouble();
        
        //Minta skor 2
        System.out.println("Maukkan skor ujian 2: ");
        skor2 = keyboard.nextDouble();
        
        //Minta skor 3
        System.out.println("Maukkan skor ujian 3: ");
        skor3 = keyboard.nextDouble();
        
        // Hitung rata-rata tiga skor
        rerata = (skor1 + skor2 + skor3)/ 3;
        
        //Tampilkan rata-rata ujian
        System.out.printf("Rata-rata ujian Anda: %.2f\n", rerata);
        
        //Jika skor lebih besar dari 60, tampilakan pesan bahwa pengguna lulus
        if (rerata > 60 )
        {
            System.out.println("Selamat!");
            System.out.println("Anda lulus!");
        }
        else
        {
             System.out.println("Anda tidak lulus!");
            System.out.println("Silahkan mengulang semester depan.");
          
                    
        }
        
        
        
        
    }
}

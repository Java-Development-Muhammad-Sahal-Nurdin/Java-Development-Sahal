// Program membuat array 2 dimensi atau multidimensi dengan user input
package com.Sahal.program;
import java.util.Scanner;

public class MUHAMMADSAHALNURDIN_51421075
{
    public static void main (String[] args) 
    {
        // Muhammad Sahal Nurdin
        // 1IA12
        // 51421075

        // Inisiasi untuk user input
            Scanner keyboard = new Scanner(System.in);
        
        // Deklarasi variabel 
            int jumlahkolom, jumlahbaris;
        
        // Array 2 dimesi
             int [][] Array = new int [50][50];
             
        // Menjalankan block program
        try{ 
              // Pengguna memasukkan angka pada baris
                   System.out.print("Masukkan angka baris : ");
                   jumlahbaris = keyboard.nextInt();
         
             // Pengguna memasukkan angka pada kolom
                    System.out.print("Masukkan angka kolom : ");
                    jumlahkolom = keyboard.nextInt();
       
             // Pengguna memasukkan nilai dari baris dan kolom, lalu mencetak looping dari masukkan 
                    for (int m = 0; m < jumlahbaris; m++){
                         for(int s = 0; s < jumlahkolom; s++){
                            System.out.print("Masukkan nilai" + "["+ (m) +"]" + "["+ (s) +"]" + " : ");
                            Array [m][s] = keyboard.nextInt();
                            }
                    }
            // Menampilkan hasil dari looping output 
                    for (int m = 0; m < jumlahbaris; m++){
                        for(int s = 0; s < jumlahkolom; s++){
                            System.out.println("Nilai array" + "["+ (m) +"]" + " : " + Array[m][s]);
              }
            }
         }
        // Tetap menjalankan block program meskipun adanya kesalahan yang muncul
        finally 
        {
            keyboard.close();
                }
     
    }    
}
/*
Program ini mendemonstrasikan array 
*/
import java.util.Scanner;
public class DemoArray 
{
    public static void main(String[] args) 
    {
        final int BANYAK_NILAI = 3;                 // Banyak nilai untuk disimpan
        int[] nilai = new int[BANYAK_NILAI];    // Array dari nilai
        
        // Buat objek scanner 
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan nilai ujian!");
        
        // Dapatkan nilai ujian 1
        System.out.print("Nilai ujian 1: ");
        nilai[0] = Keyboard.nextInt();
        
          // Dapatkan nilai ujian 2
          System.out.print("Nilai ujian 2: ");
        nilai[1] = Keyboard.nextInt();
        
          // Dapatkan nilai ujian 3
          System.out.print("Nilai ujian 3: ");
        nilai[2] = Keyboard.nextInt();
        
        // Tampilkan nilai ujian yang ditampilkan oleh pengguna 
        System.out.println("Nilai ujian yang Anda Masukkan:");
        System.out.println("Nilai ujian 1: " + nilai[0]);
        System.out.println("Nilai ujian 2: " + nilai[1]);
        System.out.println("Nilai ujian 3: " + nilai[2]);
    }
  
}

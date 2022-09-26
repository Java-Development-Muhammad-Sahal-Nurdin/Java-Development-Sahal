
import java.util.Scanner;

/*
 Program ini mendemonstrasikan penggunaan loop for
untuk memproses array
 */

public class DemoArray2 
{
    public static void main(String[] args) 
    {
        final int BANYAK_NILAI = 3;                 // Banyak nilai untuk disimpan
        int[] nilai = new int[BANYAK_NILAI];    // Array dari nilai
        
        // Buat objek scanner 
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan nilai ujian!");
        for (int index = 0; index < BANYAK_NILAI; index++ )
        {
            System.out.print("Nilai ujian " + (index + 1) + ": ");
            nilai [index] =  Keyboard.nextInt();
        }
        System.out.println("Nilai ujian yang ada masukkan: ");
        
        // Tampilkan nilai ujian yang diberikan pengguna
        for (int index = 0; index < BANYAK_NILAI; index++ )
        {
            System.out.println("Ujian " + (index + 1) + ": " + nilai[index]);    
        }
  
    }
}


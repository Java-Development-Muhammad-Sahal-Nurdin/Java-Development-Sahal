import java.util.Scanner;
/*    Program ini mendemonstrasikan input pengguna untuk     
menentukan ukuran array. */ 
public class TampilkanNilaiUjian 
{
    public static void main(String[] args) 
    {
       int bnykUjian;       // Banyak ujian
       int[] ujian;         // Array dari banyak ujian
       
       // Buat object Sacanner untuk input keyboard
       Scanner Keyboard = new Scanner(System.in);
       
       // Minta pengguna memasukkan banyak ujian
        System.out.print("Berapa banyak ujian yang akan dimasukkan: ");
        bnykUjian = Keyboard.nextInt();
        
        // Buat sebuahh array untuk mentimpan nilai-nilai ujian
        ujian  = new int[bnykUjian];
        
        // Dapatkan masing-masing nilai ujian
        for(int index = 0; index < ujian.length; index++)
        {
            System.out.print("Masukkan nilai ujian " + (index + 1) +  " : ");
            ujian [index] = Keyboard.nextInt();
        }
        // Tampilkan nilai ujian
        System.out.println();
        System.out.println("Berikut adalah nilai ujian yang Anda masukkan: ");
        
         for(int index = 0; index < ujian.length; index++)
        {
            System.out.print(ujian[index] + " ");
        }
    }
   
}

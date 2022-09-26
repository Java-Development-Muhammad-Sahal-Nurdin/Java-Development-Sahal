
import java.util.Scanner;


public class Gaji 
{
    public static void main(String[] args) 
    {
        final int PEGAWAI = 5;      // Banyak pegawai
        double honor;                 // Gaji sejam
        double gaji;                  // Gaji sebulan
        
        // Buat sebuah array untuk menyimpan jam kerja pegawai
        int[] jamKerja = new int[PEGAWAI];
        
        // Buat object Scanner
        Scanner Keyboard = new Scanner(System.in);
        
        // Dapatkan jam kerja masing-masing pegawai
        System.out.println("Masukkan masing-masing jam kerja dari " + PEGAWAI + " pegawai.");
        
        for(int index = 0; index < PEGAWAI; index++)
        {
            System.out.printf("Jam kerja pegawai ke-" + (index + 1) + ": ");
            jamKerja [index]= Keyboard.nextInt();
        }
        
        // Dapatkan honor per jam untuk semua pegawai 
        System.out.print("Masukkan honor per jam untuk semua pegawai: ");
        honor = Keyboard.nextDouble();
        
        // Hitung masing-masing gaji pegawai
        System.out.println("Berkut adalah gaji setiap pegawai: ");
        for(int index = 0; index < PEGAWAI; index++)
        {
            gaji = jamKerja[index] * honor;
            System.out.printf("Pegawai %d: Rp. %,.2f\n", (index + 1), gaji); 
        }
    }
  
}

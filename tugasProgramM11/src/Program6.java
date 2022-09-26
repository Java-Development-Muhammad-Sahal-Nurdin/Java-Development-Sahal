/* Muhammad Sahal Nurdin
   1IA12 
   51421075
*/
// Perlu dimasukkan nama package agar bisa menjalankan program
// Memanggil library inputan pengguna
import java.util.Scanner;

// Program membuat diskon dan total pembayaran
public class Program6 
{
    public static void main(String[] args)  // Main Method
    {
        // Inisiasi tipe variabel
        double totalBayar;
        double Pembelian;
        double Diskon = 0.1;
        int hargaMinimalDiskon = 1000000;
        double hargaDiskon;
        
        // Meminta input-an dari user
        Scanner keyboard = new Scanner(System.in);
        
        // Tempat masuk pembelian 
        System.out.print("Masukkan harga pembelian: ");
        Pembelian = keyboard.nextDouble(); 
        
        // Logic jika harga di atas satu juta maka akan dikenakan diskon 10%
        if (Pembelian >= hargaMinimalDiskon)
        {
            hargaDiskon = Pembelian * Diskon;        // Harga diskon
            totalBayar = Pembelian - hargaDiskon;  // Total harga yang diberikan
            
            // Output harga
            System.out.printf("Pembelian = Rp. %,.2f\n", Pembelian);
            System.out.println("Diskon = 10%");
            System.out.printf("Total Bayar = Rp. %,.2f\n", totalBayar);
        } 
        else
        {
            System.out.printf("Maaf Anda tidak mendapat diskon, harga tetap = Rp. %,.2f\n ", Pembelian);
        }            
    }
}

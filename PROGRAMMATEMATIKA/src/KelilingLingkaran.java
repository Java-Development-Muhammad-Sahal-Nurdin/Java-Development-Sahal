// Program mencari keliling lingkaran
import java.util.Scanner;
public class KelilingLingkaran 
{
    public static void main(String[] args) {
         // Deklarasi tipe data r
        int r;
        double kelilinglingkaran;
        double phi = 3.14;
       
        // Inisiasi user input 
        Scanner keyboard = new Scanner(System.in);
        
        // Masukkan user input
        System.out.print("Masukkan niali r: ");
        r = keyboard.nextInt();
        
        // Menghitung rumus luas lingkaran
        kelilinglingkaran = 2 * phi* r ;
        
        System.out.printf("Rumus luas lingkaran adalah  %.2f  ", kelilinglingkaran );
    }
}

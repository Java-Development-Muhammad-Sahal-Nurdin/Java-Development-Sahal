// Program mencari keliling segitiga
import java.util.Scanner;
public class KelilingSegitiga 
{
    public static void main(String[] args) 
    {
        // Deklarasi tipe data  
        double s1, s2, s3;
        double kelilingsegitiga;
       
        // Inisiasi user input 
        Scanner keyboard = new Scanner(System.in);
        
        // Masukkan user input
        System.out.print("Masukkan niali sisi 1: ");
        s1 = keyboard.nextInt();
        
        // Masukkan user input
        System.out.print("Masukkan niali sisi 2: ");
        s2 = keyboard.nextInt();
        
        // Masukkan user input
        System.out.print("Masukkan niali sisi 3: ");
        s3 = keyboard.nextInt();
        
        // Menghitung rumus luas lingkaran
         kelilingsegitiga= s1 + s2 + s3;
        
        System.out.printf("Rumus luas lingkaran adalah  %.2f  ", kelilingsegitiga );
    }
}

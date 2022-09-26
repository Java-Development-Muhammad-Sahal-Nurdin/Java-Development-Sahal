// Program mencari luas segitiga
import java.util.Scanner;
public class LuasSegitiga 
{
    public static void main(String[] args) 
    {
        // Deklarasi tipe data 
        double a, t;
        double luassegitiga;
        
        // Inisiasi user input 
        Scanner keyboard = new Scanner(System.in);
        
        // Masukkan user input
        System.out.print("Masukkan niali a: ");
        a = keyboard.nextInt();
        
        // Masukkan user input
        System.out.print("Masukkan niali t: ");
        t = keyboard.nextInt();
        
        // Menghitung rumus luas lingkaran
        luassegitiga =  (a* t)/2 ;
        
        System.out.printf("Rumus luas lingkaran adalah  %.2f  ", luassegitiga );
    }
}

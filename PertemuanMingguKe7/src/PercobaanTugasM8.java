
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class PercobaanTugasM8 
{
    public static void main(String[] args) 
    {
         // Muhammad Sahal Nurdin
        // 1IA12
        // 51421075

        // Inisiasi untuk user input
            Scanner keyboard = new Scanner(System.in);
        
        // Deklarasi variabel 
            int jumlahkolom, jumlahbaris;
        
        // Array 2 dimesi
             int [][] Array = new int [100][100];
        
        try{ 
              // Pengguna memasukkan angka pada baris
                   System.out.print("Masukkan angka baris : ");
                   jumlahbaris = keyboard.nextInt();
         
             // Pengguna memasukkan angka pada kolom
                    System.out.print("Masukkan angka kolom : ");
                    jumlahkolom = keyboard.nextInt();
       
             // Mncetak looping masukkan 
                    for (int m = 0; m < jumlahbaris; m++){
                         for(int s = 0; s < jumlahkolom; s++){
                            System.out.print("Maukkan nilai :" + "["+ (m) +"]" + "["+ (s) +"]" + " : ");
                            Array [m][s] = keyboard.nextInt();
                            }
                    }
            // Menampilkan looping dari output 
                    for (int m = 0; m < jumlahbaris; m++){
                        for(int s = 0; s < jumlahkolom; s++){
                            System.out.println("Nilai Array:" + "["+ (m) +"]" + " : " + Array[m][s]);;
              }
            }
         }
        finally 
        {
            keyboard.close();
                }
     
    }    
}

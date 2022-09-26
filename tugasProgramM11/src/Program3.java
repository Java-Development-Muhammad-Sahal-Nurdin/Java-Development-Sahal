/* Muhammad Sahal Nurdin
   1IA12 
   51421075
*/
// Perlu dimasukkan nama package agar bisa menjalankan program
public class Program3 
{
    public static void main(String[] args) 
    {
        // Struktur perulangan for
        /*
        for(int i = 1; i <= 10; i+= 2)
        {
            System.out.println(i + " ");
        }
        */
        // Struktur perulangan do while
        int i = 1;                               // Inisiasi nilai awal
        do {
            System.out.print(i);
            i = i + 2;                            // Untuk mendapatkan nilai negatif 
            System.out.print(" ");          // Untuk spasi
        } while (i <= 10);                     // Batas perulangan sampai dilakukan
    }
}

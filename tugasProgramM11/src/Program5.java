/* Muhammad Sahal Nurdin
   1IA12 
   51421075
*/
// Perlu dimasukkan nama package agar bisa menjalankan program
public class Program5 
{
    public static void main(String[] args) 
    {
        int i, j;
        
        for ( i = 0; i < 11; i++) 
        {
            System.out.println("Ini kelompok loop ke-" + i);     // Ini untuk ke bawah
          for (j = 1; j < 100; j++) 
          {
                System.out.println("Ini loop ke-" + j);             // Ini untuk ke kanan
                System.out.println("Teknik Informatika");         // Program ini akan mencetak sebanyak 1089 Teknik Informatika
                                                                                 // Karena 99 * 11 adalah 1089, karena ada kelompok loop dari 0 - 10 yang berjumlah 11
          }
        }
    }
}

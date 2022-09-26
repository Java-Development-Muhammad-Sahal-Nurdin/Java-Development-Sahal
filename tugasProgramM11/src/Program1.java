/* Muhammad Sahal Nurdin
   1IA12 
   51421075
*/
// Perlu dimasukkan nama package agar bisa menjalankan program
public class Program1 
{
    public static void main(String[] args) 
    {
        /*
        Soal awal menunjukan hasil 15. Namun, ini kurang tepat karena 
        jawaban sesungguhnya adalah 1.8 dengan tipe double.
        int Total;
        int a=2, b=3, c=6, d=5;
        Total  = b * d - c / a + b;
        System.out.print ("Total:" + Total);
      */
        // Soal setelah perbaikan
        double Total;                                     // Karena hasil yang didapatkan nantinya adalah berupa pecahan
        double a = 2.0, b = 3.0, c = 6.0, d = 5.0; // Harus bentuk pecahan agar hasil yang didapat presisi
        /*
        Harus diberi tanda kurung untuk 
        kejelasan hirarki pada operasi matematika ini.
      */
        Total = ( b * d  - c) / ( a + b ); 
        System.out.println("Total:" + Total);   // Output dari program ini
    }
}

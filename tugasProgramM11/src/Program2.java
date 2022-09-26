/* Muhammad Sahal Nurdin
   1IA12 
   51421075
*/
// Perlu dimasukkan nama package agar bisa menjalankan program
public class Program2 
{
    public static void main(String[] args) 
    {
        /*
        Hasil yang didapatkan adalah 2 yang mana bilangan integer
        untuk mendapatkan nilai yang lebih presisi maka 
        perlu digunakan tipe data double
        int a = 9; int b = 4;
        int c= a/b;
        System.out.print ("c:" + c);
      */
        double c;                                     // Hasil yang didapatkan adalah pecahan
        double a = 9.0;                             // Bentuk pecahan
        double b = 4.0;                             // Bentuk pecahan
        c = a / b;
        System.out.println("C:" + c);         
        System.out.printf("C:%.2f\n", c);   // Atau menggunakan print format juga bisa dilakukan
    }
}

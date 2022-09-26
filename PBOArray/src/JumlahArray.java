import java.util.Scanner;
/* Program ini mendemostrasikan sebuah method yang menerima    
   sebuah array sebagai argument. */ 
public class JumlahArray 
{
    public static void main(String[] args) 
    {
        double[] skor = new double[5];
        double jumlah;
        
        Scanner Keyboard = new Scanner (System.in);
        
        for(int i = 0; i  < 5; i++)
        {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            skor[i]= Keyboard.nextInt();
        }
            jumlah = sum(skor);
            System.out.println("Jumlah angka = " + jumlah);
           
        }
        /* Method ini menerima semua array tipe double 
    dan mengembalikan jumlah dari elemen-elemen array yang diberikan*/
    public static double sum(double[] nilai)
    {
        double total = 0.0;
        for(double elemen: nilai)
        {
            total+=elemen;
        }
        return total;
    }
    
}

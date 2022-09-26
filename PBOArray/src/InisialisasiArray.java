/*
    Progrma berikut mendemonstrasikan pembuatan 
 array dengan inisialisasi
 */
public class InisialisasiArray 
{
    public static void main(String[] args) 
    {
        int[] hari = {31, 28, 31, 30, 31, 30,
                          31, 31, 30, 31, 30, 31};
        for(int index = 0; index < 12; index++)
        {
            System.out.println("Bulan " + (index + 1) + " mempunyai " 
                                       + hari[index] + " Hari.");
        }
    }
    
}

/*
Program ini menggunakan angka indeks yang tidak valid
 */
public class IndeksSalah 
{
    public static void main(String[] args) 
    {
        int[] bilBulat = new int[3];
        
        System.out.println("Saya akan mencoba menyimpan 4"
                + " angka ke array dengan tiga elemen.");
        for( int indeks = 0; indeks < 4; indeks++)
        {
            System.out.println("Memproses elemen"  + indeks);
            bilBulat [indeks] = 10;
        }
    }
 
}

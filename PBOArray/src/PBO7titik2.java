
public class PBO7titik2 
{
    public static void main(String[] args) 
    {
     // Soal 1
            // int[] himpAngka1 = { 1, 3, 6, 9 };
            // int[] himpAngka2 = { 2, 4, 6, 8 };
            // int hasil;
            // hasil = himpAngka1[0] * himpAngka2[3];
            // System.out.println(hasil);
     // Soal 2
        int[] a = { 1, 3, 6, 9 };
        int[] b = a;
         // Tampilkan semua elemen menggunalan array1
        for(int nilai : a)
        {
            System.out.print(nilai + " ");
        }
        System.out.println();
        
        // Tampilkan semua elemen menggunalan array2
        for(int nilai : b)
        {
            System.out.print(nilai + " ");
        }
        System.out.println();

        // atau juga bisa
        // for(int i = 0; i<a.length; i++)
       // {
                //b[i]=a[i];
   //     }
   
}
}
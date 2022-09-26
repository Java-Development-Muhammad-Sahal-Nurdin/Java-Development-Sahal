
public class ArraySama 
{
    public static void main(String[] args) 
    {
        int[] array1 = { 2, 4, 6, 8, 10};
        int[] array2 = array1;
                
       // Ubah salah satu elemen array menggunakan array 1
       array1[0] = 200;
       
       // Ubah salah satu elemen array menggunakan array 2
        array2[4] = 1000;
        
        // Tampilkan semua elemen menggunalan array1
        for(int nilai : array1)
        {
            System.out.print(nilai + " ");
        }
        System.out.println();
        
        // Tampilkan semua elemen menggunalan array2
        for(int nilai : array2)
        {
            System.out.print(nilai + " ");
        }
        System.out.println();

    }
  
}

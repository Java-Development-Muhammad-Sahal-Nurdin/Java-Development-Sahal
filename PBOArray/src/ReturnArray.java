/*  Program ini mendemonstrasikan sebuah method yang mengembalikan    
referensi ke sebuah array. */ 
public class ReturnArray 
{
    public static void main(String[] args) 
    {
        double [] nilai;
        nilai = getArray(10);
        
        // Cetak array yang didapatkan dari pemanggilan
        // Method getArray
        
        for ( double elemen : nilai)
        {
            System.out.println(elemen);
            
        }
    }
        /* Method ini meng-generate angka random sebanyak nilai argument yang diberikan
         Method ini mengembalikan sebuah array dengan nilai-nilai yang digenerate
        */
        public static double[] getArray(int bykElemen)
        {
            double [] arrDouble = new double [bykElemen];
            for(int i = 0; i < bykElemen; i++)
            {
                // Isi elemen dengan angka random double antara 0 sd. 100
                arrDouble[i] = Math.random() * 100;
                
            }
            return arrDouble;
    }
}

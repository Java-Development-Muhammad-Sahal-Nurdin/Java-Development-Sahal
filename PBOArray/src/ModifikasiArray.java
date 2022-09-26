/*    Program ini mendemonstrasikan method yang mengubah    
nilai-nilai elemen pada array yang diberikan sebagai argument. */ 
public class ModifikasiArray 
{
    public static void main(String[] args) 
    {
        double[] skor = {32, 54, 67.5, 29, 35};
        // Cetajk nilai array sebelum dimodifikasi
        System.out.print("Array sebelum modifikasi: ");
        for(double elemen : skor)
        {
            System.out.print(elemen + " ");  
        }
        System.out.println();
        
        // Modifikas array skor dengan memanggil method multiply
        multiply (skor, 10);
        // Cetajk nilai array sebelum dimodifikasi
        System.out.print("Array setelah modifikasi: ");
        for(double elemen : skor)
        {
            System.out.print(elemen + " ");  
        }
        System.out.println();  
    }
        
        /* 
        method ini memodifikasi nilai-nilai elemen pada array yang diberikan
        sebagai argument pertama mengalikian setiap nilai elemen dengan nilai 
        yang diberikan sebagai argumen kedua. method ini tidak mengwmbalikan nilai
        */
        public static void multiply(double[] nilai, double faktor)
        {
            for(int i = 0; i < nilai.length; i++)
            {
                nilai[i] = nilai[i] * faktor;
                
            }
            
        }
    }
    


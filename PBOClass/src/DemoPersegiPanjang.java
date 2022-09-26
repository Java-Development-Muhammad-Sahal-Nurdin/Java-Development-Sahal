/* 
    Program berikut mendemonstrasikan penggunaan method 
    setPanjang dan setLebar dari class PersegiPanjang
*/
public class DemoPersegiPanjang 
{
    public static void main(String[] args) 
    {
        // Buat sebuah object PersegiPanjang dan
        // tugaskan alamatnya ke variabel boks.
        PersegiPanjang2 boks = new PersegiPanjang2();
        
        // Panggil method setPanjang, berikan nilai 20.0
        // sebagai argument
        boks.setPanjang(20.0);  // Menugaskan filed panjang dengan nilai 20.0
        
        // Panggil method setLebar, berikan nilai 10.0
        // sebagai argument
        boks.setLebar(10.0);  // Menugaskan filed panjang dengan nilai 10.0
        
        // Tampilkan panjang dan lebar dari object PersegiPanjang
        System.out.println("Panjang boks adalah " + boks.getPanjang());
        System.out.println("Lebar boks adalah " + boks.getLebar());
    }
 
}

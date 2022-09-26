
public class DemoConstructor 
{
    public static void main(String[] args) 
    {
        // Membuat sebuah object persegi panjang
        // Dgn memberikan 15.0 dan 5.0 sbg argument ke dalam constructor
        PersegiPanjang boks = new PersegiPanjang(15.0, 5.0);
        
        // Tampilkan panjang boks
        System.out.println("Panjang boks adalah " + boks.getPanjang());
        // Tampilkan lebar boks
        System.out.println("Lebar boks adalah " + boks.getLebar());
        // Tampilkan luas boks
        System.out.println("Luas boks adalah " + boks.getLuas());
    }
    
}

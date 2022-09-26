// Menghitung jarak jelajah cahaya menggunakan variabel long
public class JarakJelajahCahaya 
{
    public static void main(String[] args) 
    {
        long kecCahaya;
        long detik;
        long hari;
        long jarak;
        
        // Kecepatan cahaya dalam km per detik melalui pendekatan
        kecCahaya = 34000;
        // Menetapkan jumlah hari
        hari = 1000;
        // Mengkonversi ke detik
        detik = hari * 24 * 60 * 60;
        //Menghitung jarak
        jarak = kecCahaya * detik;
        
        System.out.print("Dalam " + hari);
        System.out.print(" hari, cahaya menjelajah berkisar ");
        System.out.println(jarak + " km.");
        
    }
}

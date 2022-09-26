import java.util.Scanner;
public class LuasRuangan 
{
    public static void main(String[] args) 
    {
        double totalLuas;
        Scanner Keyboard = new Scanner(System.in);
        
        PersegiPanjang dapur = new PersegiPanjang();
        PersegiPanjang kamarTidur = new PersegiPanjang();
        PersegiPanjang ruangKerja = new PersegiPanjang();
        
        System.out.print("Masukkan panjang dapur: ");
        dapur.setPanjang(Keyboard.nextDouble());
        
        System.out.print("Masukkan lebar dapur: ");
        dapur.setLebar(Keyboard.nextDouble());
        
        System.out.print("Masukkan panjang kamar tidur: ");
        kamarTidur.setPanjang(Keyboard.nextDouble());
        
        System.out.print("Masukkan lebar kamar tidur: ");
        kamarTidur.setLebar(Keyboard.nextDouble());
        
        
        System.out.print("Masukkan panjang ruang kerja: ");
        ruangKerja.setPanjang(Keyboard.nextDouble());
        
        System.out.print("Masukkan lebar ruang kerja: ");
        ruangKerja.setLebar(Keyboard.nextDouble());
        
        totalLuas = dapur.getLuas() + kamarTidur.getLuas() + ruangKerja.getLuas();
        
        System.out.println("Total luas dari tiga ruamg adalah " + totalLuas);
    }
}

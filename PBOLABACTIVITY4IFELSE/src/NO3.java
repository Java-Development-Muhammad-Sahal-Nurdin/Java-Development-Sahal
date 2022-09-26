import java.util.Scanner;
public class NO3 
{
     public static void main(String[] args)
    {
       
        //deklarasi variabel tarif
        double beratPaket;
        int tarif1 = 1500;
        int tarif2 = 3000;
        int tarif3 = 5000;
        int tarif4 = 5500;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan berat paket Anda (kg): ");
        beratPaket = input.nextDouble();
        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarakPengiriman = input.nextDouble();
        
        
        if (beratPaket <= 2){
            int jarakPengiriman1 = (int) jarakPengiriman;
            
            int totalTarif = jarakPengiriman1 * tarif1;
            double totalTarif1 = (double) totalTarif;
            
            System.out.printf("Tarif Pengiriman = Rp.%,.2f",totalTarif1);
        }
        else if (beratPaket > 2 && beratPaket <= 6){
            int jarakPengiriman1 = (int) jarakPengiriman;
            
            int totalTarif = jarakPengiriman1 * tarif2;
            double totalTarif2 = (double) totalTarif;
            
            System.out.printf("Tarif Pengiriman = Rp.%,.2f",totalTarif2);
        }
        else if (beratPaket > 6 && beratPaket <= 10){
            int jarakPengiriman1 = (int) jarakPengiriman;
            
            int totalTarif = jarakPengiriman1 * tarif3;
            double totalTarif3 = (double) totalTarif;
            
            System.out.printf("Tarif Pengiriman = Rp.%,.2f",totalTarif3);
        }
        else {
            int jarakPengiriman1 = (int) jarakPengiriman;
            
            int totalTarif = jarakPengiriman1 * tarif4;
            double totalTarif4 = (double) totalTarif;
            
            System.out.printf("Tarif Pengiriman = Rp.%,.2f",totalTarif4);
        }
        
        
    }
}
    


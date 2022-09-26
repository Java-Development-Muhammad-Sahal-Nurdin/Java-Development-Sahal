import java.util.Scanner;
public class NO2 
{
    public static void main(String[] args)
    {
   
    double jampemakaian;
    char nilai;
    double totaltagihan;
    double paket, kelebihanjam;
    double nambahbuattagihan, jamakses, totalkelebihanjam;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Masukkan paket [A,B,C]: ");
    nilai = input.next().charAt(0);
     
    if (nilai == 'A' ) {
      System.out.print("Masukkan jam pemakaian: ");
        jampemakaian = input.nextDouble();
        int jampemakaian1=(int)jampemakaian;
        paket = 100000;
        jamakses = 20;
        nambahbuattagihan = jampemakaian1 - jamakses;
        totalkelebihanjam = nambahbuattagihan * 5000;
        totaltagihan = paket + totalkelebihanjam;
        int totaltagihan1=(int)totaltagihan;
        if (jampemakaian > 20){
            System.out.printf("Total tagihan = Rp.%,.2f", totaltagihan);
    }
    }
    else if (nilai == 'B' ) {
        System.out.print("Masukkan jam pemakaian: ");
        jampemakaian = input.nextDouble();
        int jampemakaian1=(int)jampemakaian;
        paket = 200000;
        jamakses = 50;
        nambahbuattagihan = jampemakaian1 - jamakses;
        totalkelebihanjam = nambahbuattagihan * 5000;
        totaltagihan = paket + totalkelebihanjam;
        int totaltagihan1=(int)totaltagihan;
        if (jampemakaian > 50){
            System.out.printf("Total tagihan = Rp.%,.2f", totaltagihan);
    } else {System.out.printf("Total tagihan = Rp.%,.2f", paket);}
}
    else if (nilai == 'C' ) {
        System.out.print("Masukkan jam pemakaian: ");
        jampemakaian = input.nextDouble();
        int jampemakaian1=(int)jampemakaian;
        paket = 350000;
        totaltagihan = paket;
        int totaltagihan1=(int)totaltagihan;
        if (jampemakaian > 0){
            System.out.printf("Total tagihan = Rp.%,.2f", totaltagihan);
    }
}
    else {
      System.out.print("Masukkan jam pemakaian: ");
        jampemakaian = input.nextDouble();
        int jampemakaian1=(int)jampemakaian;
        paket = 350000;
        totaltagihan = paket;
        int totaltagihan1=(int)totaltagihan;
        if (jampemakaian > 0){
        System.out.println("Salah input! Jenis paket hanya A, B, atau C.");}
    }
    
  }
}
    


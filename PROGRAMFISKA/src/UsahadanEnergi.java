import java.util.Scanner; 
public class UsahadanEnergi 
{ 
    public static void main(String args[]) 
    { 
        Scanner simpan = new Scanner (System.in);
        int baca1 = 0, baca2 = 0, baca3 = 0, baca4 = 0; 
        double hasil, hasil2, hasil3; 
        String loop;

System.out.println("+-----------------------------------+"); 
System.out.println("|     Menu Program Rumus Fisika     |"); 
System.out.println("+-----------------------------------+"); 
System.out.println("| 1. Usaha(W)                       |"); 
System.out.println("| 2. Daya(P)                        |"); 
System.out.println("| 3. Energi Potensial(Ep)           |"); 
System.out.println("| 4. Energi Kinetik(Ek)             |"); 
System.out.println("| 5. Energi Mekanik(Em)             |"); 
System.out.println("| 6. Selesai                        |"); 
System.out.println("+-----------------------------------+"); 

for (loop = "Y"; loop.equals ("Y") || loop.equals ("y");) 
{ 
    System.out.print("Pilih Menu (1 s/d 6) : ");
 int pilihan = simpan.nextInt();

switch(pilihan){ 
    case 1: 
//membaca besarnya nilai elemen rumus System.out.println(""); 
        System.out.println("+-----------------------------------+"); 
        System.out.println(" 1. Menghitung Besarnya Usaha(W)"); 
        System.out.println("+-----------------------------------+"); 
        System.out.print("Masukkan besarnya Gaya(N) = "); 
        baca1 = simpan.nextInt(); 
        System.out.print("Masukkan Perpindahan Benda(m) = "); 
        baca2 = simpan.nextInt(); 
        hasil = baca1 * baca2; 
//mencetak hasil perhitungan System.out.println(""); 
        System.out.println("+Dik. ------------------------------+"); 
        System.out.println("Gaya(F) = "+baca1+" N"); 
        System.out.println("Perpindahan(S) = "+baca2+" m"); 
        System.out.println(""); 
        System.out.println("-> Usaha(W) = F * S "); 
        System.out.println(" W = "+baca1+" * "+baca2); 
        System.out.println(" W = "+hasil+" Joule"); 
        System.out.println("+ ----------------------------------+"); 
        break;

        case 2: 
//membaca besarnya nilai elemen rumus 
            System.out.println(""); 
            System.out.println("+-----------------------------------+"); 
            System.out.println(" 2. Menghitung Besarnya Daya(P)"); 
            System.out.println("+-----------------------------------+"); 
            System.out.print("Masukkan besarnya Usaha(J) = "); 
            baca1 = simpan.nextInt(); 
            System.out.print("Masukkan lamanya Waktu(s) = "); 
            baca2 = simpan.nextInt(); 
            hasil = baca1 / baca2; 
//mencetak hasil perhitungan System.out.println(""); 
            System.out.println("+Dik. ------------------------------+"); 
            System.out.println("Usaha(W) = "+baca1+" J"); 
            System.out.println("Waktu(t) = "+baca2+" s");
            System.out.println(""); System.out.println("-> Daya(P) = W / t"); 
            System.out.println(" P = "+baca1+" / "+baca2); 
            System.out.println(" P = "+hasil+" J/s"); 
            System.out.println("+-----------------------------------+");
            break;

case 3:
    //membaca besarnya nilai elemen rumus 
    System.out.println(""); 
    System.out.println("+-----------------------------------+"); 
    System.out.println(" 3. Menghitung Energi Potensial(Ep)"); 
    System.out.println("+-----------------------------------+"); 
    System.out.print("Masukkan Massa Benda(kg) = "); 
    baca1 = simpan.nextInt(); 
    System.out.print("Masukkan Grafitasi Bumi(m/s^2) = "); 
    baca2 = simpan.nextInt(); 
    System.out.print("Masukkan Ketinggian Benda(m) = "); 
    baca3 = simpan.nextInt(); 
    hasil = baca1 * baca2 * baca3; 
//mencetak hasil perhitungan System.out.println(""); 
    System.out.println("+Dik. ------------------------------+"); 
    System.out.println("Massa Benda(m) = "+baca1+" kg"); 
    System.out.println("Grafitasi Bumi(g) = "+baca2+" m/s^2"); 
    System.out.println("Ketinggian Benda(h) = "+baca3+" m"); 
    System.out.println(""); System.out.println("-> Energi Potensial(Ep) = m * g * h"); 
    System.out.println(" Ep = "+baca1+" * "+baca2+" * "+baca3); 
    System.out.println(" EP = "+hasil+" Joule"); 
    System.out.println("+-----------------------------------+"); 
    break;

case 4: 
//membaca besarnya nilai elemen rumus 
    System.out.println(""); 
    System.out.println("+-----------------------------------+"); 
    System.out.println(" 4. Menghitung Energi Kinetik(Ep)"); 
    System.out.println("+-----------------------------------+"); 
    System.out.print("Masukkan Massa Benda(kg) = "); 
    baca1 = simpan.nextInt(); 
    System.out.print("Masukkan Kecepatan Benda(m/s) = "); 
    baca2 = simpan.nextInt(); hasil = 0.5 * baca1 * (baca2 * baca2); 
//mencetak hasil perhitungan System.out.println(""); 
    System.out.println("+Dik. ------------------------------+"); 
    System.out.println("Massa Benda(m) = "+baca1+" kg"); 
    System.out.println("Kecepatan Benda(v) = "+baca2+" m/s"); 
    System.out.println(""); System.out.println("-> Energi Kinetik (Ek) = 0.5 * m * (v^2)"); 
    System.out.println(" Ek = 0.5 * "+baca1+" * ("+baca2+"^2)"); 
    System.out.println(" Ek = "+0.5 * baca1+" * "+baca2 * baca2); 
    System.out.println(" Ek = "+hasil+" Joule"); 
    System.out.println("+-----------------------------------+"); 
    break;

case 5: 
//header rumus 5 System.out.println(""); 
    System.out.println("+-----------------------------------+"); 
    System.out.println(" 5. Menghitung Energi Mekanik(Em)"); 
    System.out.println("+-----------------------------------+"); 
//membaca besarnya nilai elemen rumus Ep 
    System.out.println("-> Menghitung Energi Potensial(Ep)"); 
    System.out.print(" Massa Benda(m) = "); 
    baca1 = simpan.nextInt(); 
    System.out.print(" Grafitasi Bumi(g) = "); 
    baca2 = simpan.nextInt(); 
    System.out.print(" Ketinggian Benda(h) = "); 
    baca3 = simpan.nextInt(); 
    hasil = baca1 * baca2 * baca3; 
//mencetak hasil perhitungan Ep 
    System.out.println(""); 
    System.out.println("-> Energi Potensial(Ep) = m * g * h"); 
    System.out.println(" Ep = "+baca1+" * "+baca2+" * "+baca3); 
    System.out.println(" EP = "+hasil+" Joule"); 
    System.out.println("+-----------------------------------+"); 
//membaca besarnya nilai elemen rumus Ek 
    System.out.println("-> Menghitung Energi Kinetik(Ek)"); 
    System.out.println(" Massa Benda(m) = "+baca1); 
    System.out.print(" Kecepatan Benda(v) = "); 
    baca4 = simpan.nextInt(); hasil2 = 0.5 * baca1 * (baca4 * baca4); 
//mencetak hasil perhitungan Ek System.out.println(""); 
    System.out.println("-> Energi Kinetik (Ek) = 0.5 * m * (v^2)"); 
    System.out.println(" Ek = 0.5 * "+baca1+" * ("+baca4+"^2)"); 
    System.out.println(" Ek = "+0.5 * baca1+" * "+baca4 * baca4); 
    System.out.println(" Ek = "+hasil2+" Joule"); 
    System.out.println("+-----------------------------------+"); 
//mencetak hasil perhitungan System.out.println(""); 
    System.out.println("+Dik. ------------------------------+"); 
    System.out.println("Energi Potensial(Ep) = "+hasil+" Joule"); 
    System.out.println("Energi Kinetik(Ek) = "+hasil2+" Joule"); 
    hasil3 = hasil + hasil2; 
//mencetak hasil perhitungan Em System.out.println(""); 
    System.out.println("-> Energi Mekanik (Em) = Ep + Ek"); 
    System.out.println(" Em = "+hasil+" + "+hasil2); 
    System.out.println(" Em = "+hasil3+" Joule"); 
    System.out.println("+-----------------------------------+"); 
    break; 

case 6: 
    System.out.println("Selesai"); 
    System.out.println(""); 
    break; 
default: 
    System.out.println("Maaf, menu yang anda pilih tidak tersedia.."); 
} 
System.out.print("Menghitung dengan rumus fisika lainnya? (Y/N) : "); 
loop = simpan.next();


    }

}
}

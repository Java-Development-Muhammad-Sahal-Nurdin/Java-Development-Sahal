// Menghitung hukum newton 1, 2, dan 3
import java.util.Scanner;
public class HukumNewton 
{
    public static void main(String[] args) 
    {
        // Instansiasi dari input scanner yang ada
        Scanner Keyboard = new Scanner (System.in);
        
        // Deklarasi tipe data dari setiap variabel dan konstanta yang ada
        int baca1, baca2, baca3, pilihan;
        double hasil1, hasil2, hasil3;
        String loop;
        
        // Daftar menu dari rumus yang mau dihitung
        System.out.println("+---------------------------+");
        System.out.println("|   Daftar Hukum Newton     |");
        System.out.println("+---------------------------+");
        System.out.println("| 1. Hukum Newton 1         |");
        System.out.println("| 2. Hukum Newton 2         |");
        System.out.println("| 3. Hukum Newton 3         |");
        System.out.println("| 4. Exit                   |");
        System.out.println("+---------------------------+");
        
        // Masukkan perulangan for jika memenuhi
        for (loop="Y"; loop.equals("Y") || loop.equals("y"); )
        {
            // Masukkan angka yang diinginkan untuk memilih menu
        System.out.print("Masukkan angka (1/2/3): ");
        pilihan = Keyboard.nextInt();

                switch (pilihan)
        {
            case 1:
                // Membaca pilihan nomor 1
                System.out.println("+---------------------------+");
                System.out.print("Masukkan nilai W: ");
                baca1 = Keyboard.nextInt();
                System.out.println("+---------------------------+");
                hasil1 = 0 + baca1;
               // Menampilkan jawaban
                System.out.println("Diketahui: ");
                System.out.println("Nilai W(Massa): " + baca1);
                System.out.println("Maka nilai tegangan tali adalah " + hasil1 + " N");
                break;
             
            case 2:
                // Membaca pilihan nomor 2
                System.out.println("+---------------------------+");
                System.out.print("Masukkan nilai Massa (M): ");
                baca1 = Keyboard.nextInt();
                System.out.println("+---------------------------+");
                System.out.print("Masukkan nilai percepatan (a): ");
                System.out.println("+---------------------------+");
                baca2 = Keyboard.nextInt();
                hasil2 = baca1 * baca2;
                
               // Menampilkan jawaban
                System.out.println("Diketahui: ");
                System.out.println("Nilai Massa (M): " + baca1);
                System.out.println("Nilai percepatan (a): " + baca2);
                System.out.println("Maka nilai tegangan tali adalah " + hasil2 + " N");
                break;
                
            case 3:
                // Membaca pilihan nomor 3
                System.out.println("+---------------------------+");
                System.out.print("Masukkan nilai Massa (M): ");
                baca1 = Keyboard.nextInt();
                System.out.println("+--------------------------------+");
                System.out.print("Masukkan nilai percepatan (a): ");
                baca2 = Keyboard.nextInt();
                System.out.println("+--------------------------------+");
                hasil3 = baca1 * baca2;
                
               // Menampilkan jawaban
                System.out.println("Diketahui: ");
                System.out.println("Nilai Massa (M): " + baca1);
                System.out.println("Nilai percepatan (a): " + baca2);
                System.out.println("Maka nilai tegangan tali adalah " + hasil3 + " N");
                break;
                
            case 4:
                System.out.println("Program selesai ");
                System.out.println("");
                break;
            
            default:
                System.out.println("Maaf perintah yang ada masukkan tidak ada di menu");
        }
            System.out.println("Apakah Anda ingin melanjutkan (Y/N):" );
            loop = Keyboard.next();
           
            
        
    }
    
        }
    }



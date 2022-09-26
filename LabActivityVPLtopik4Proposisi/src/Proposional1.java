
import java.io.*;

public class Proposional1
{
     public static void main(String[]args) throws Exception       
{
  
    {
        // Deklarasi variabel
        int p, q;
        int pilihan;
        
        // Fungsi dari BufferredReader ini adalah untuk menangkap inputan dari keyboard
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Program Proporsional\n");
        
        // Menanyakan nilai P, input dari user
        System.out.print("Masukkan Nilai P (1 atau 0) : ");
        p = Integer.parseInt(input.readLine());
        
        // Menanyakan nilai Q, input dari user
        System.out.print("\nMasukkan Nilai Q (1 atau 0) : ");
        q = Integer.parseInt(input.readLine());
        if((q>1) || (p>1))
        {
            System.out.println("Maaf Inputan Anda Salah");
        }
        else 
        {
            while((q <= 1) || (p <= 1))
            {
                // Menampilkan pilihan menu kepada user untuk melakukan aksi
                System.out.println("    Menu Pilihan");
                System.out.println("=1.Konjungsi      =");
                System.out.println("=2.Disjungsi      =");
                System.out.println("=3.Kondisional    =");
                System.out.println("=4.Bikondisional  =");
                System.out.println("=5.Exit           =");
                
                System.out.print("\nPilih menu: ");
                
                pilihan=Integer.parseInt(input.readLine());
                switch (pilihan)
                {
                    // Menampilkan perintah konjungsi jika user pilih 1
                    case 1:
                        if((p == 1) && (q == 1)){
                            System.out.println("\nHasil Dari P ^ Q = 0\n");
                        }
                        else{
                            System.out.println("\nHasil Dari P ^ Q = 0\n");
                        }
                        break;
                    // Menampilkan perintah disjungsi jika user pilih 2
                    case 2:
                        if((p == 0) && (q ==0)){
                            System.out.println("\nHasil Dari P V Q = 0\n");
                        }
                        else {
                            System.out.println("\nHasil Dari P V Q = 1\n");
                        }
                        break;
                    // Menampilkan perintah kondisional jika user pilih 3
                    case 3:
                        if((p == 1)&&(q == 0)){
                            System.out.println("\nHasil Dari P -> Q = 0\n");
                        }
                        else {
                            System.out.println("\nHasil Dari P -> Q = 1\n");
                        }
                        break;
                    // Menampilkan perintah biimplikasi jika user pilih 4
                    case 4:
                        if(((p==1)&&(q==1))||((p==0)&&(q==0))){
                            System.out.println("\nHasil Dari P <-> Q = 1\n");
                        }
                        else {
                            System.out.println("\nHasil Dari P <-> Q = 0\n");
                        }
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        
                        // Menampilkan jika user input selain 1,2,3,4
                        System.out.println("salah masukan pilihan");
                        break;
                }
            }
        }
    }
}
    }
    


// Program inheritance atau pewarisan sederhana.
// Menciptakan sebuah superkelas
class A{
int i, j;
    void tampilij() {
        System.out.println("i dan j: " + i + " " + j);
    }
    }

// Menciptakan sebuah sub kelas dengan mewarisi kelas A.
 class B extends A  {
     int k;
     
     void tampilk() {
         System.out.println("k: " + k);
     }

     void jum() {
         System.out.println("i+j+k: " + (i+j+k));
     }
     }
public class Bentuk1 {
    public static void main(String[] args) 
    {
        A superOb = new A();
        B subOb = new B();
        
        // Superkelas dapat menggunakan dirinya sendiri.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Isi dari superOb: ");
        superOb.tampilij();
        System.out.println();
        
        // Subkelas dapat mengakses semua anggota publik dari superkelasnya
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Isi darisubOb: ");
        subOb.tampilij();
        subOb.tampilk();
        System.out.println();
        System.out.println("Penjualan atas i, j dan k di dalam subOb: ");
        subOb.jum();
        
    }
}

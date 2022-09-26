// Muhammad Sahal Nurdin
// 51421075
// 1IA12

// Program inheritance atau pewarisan sederhana.
// Menciptakan sebuah superkelas
class A{
int p, q;
    void tampilpq() {
        System.out.println("p dan q: " + p + " " + q);
    }
    }

// Menciptakan sebuah subkelas dengan mewarisi kelas A.
 class B extends A  {
     int r;
     
     void tampilr() {
         System.out.println("r: " + r);
     }

     void jum() {
         System.out.println("p+q+r: " + (p+q+r));
     }
     }

public class MUHAMMADSAHALNURDIN51421075 
{
    public static void main(String[] args) 
    {
        A superOb = new A();
        B subOb = new B();
        
        // Superkelas dapat menggunakan dirinya sendiri.
        superOb.p = 90;
        superOb.q = 100;
        System.out.println("Isi dari superOb: ");
        superOb.tampilpq();
        System.out.println();
        
        // Subkelas dapat mengakses semua anggota publik dari superkelasnya
        subOb.p = 4;
        subOb.q = 18;
        subOb.r = 3;
        System.out.println("Isi dari subOb: ");
        subOb.tampilpq();
        subOb.tampilr();
        System.out.println();
        System.out.println("Penjualan atas p, q dan r di dalam subOb: ");
        subOb.jum();
        
    }
}

   
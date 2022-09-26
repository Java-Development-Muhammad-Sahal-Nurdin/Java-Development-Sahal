
public class MingguKe10 
{
    public static void main(String[] args) {
        rumahindah C = new rumahindah();
        C.info();
        }
        }
// Membuat program Inheritance (Pewarisan)
class Rumah {
     String a = " Rumah Mewah ";
    public void info() {
        //System.out.println(" Dipanggil pada = "+this);
        System.out.println(" ");
        System.out.println(" Rumah = "+a);
    }
}
        class rumahindah extends Rumah {
             String b = " Rumah Sangat Mewah ";
            public void info(){
                System.out.println(" ");
            super.info();
                System.out.println(" Rumah indah = "+b);
  }
}



public class TipeDataNumber {
    public static void main(String[] args) {
        /*
        // INI TIPE DATA INTEGER
        byte inibyte = 100;
        short inishort = 1000;
        int iniint =10000;
        long inilong = 1000000;
        long inilong1 = 100000000L;
        
        // INI TIPE DATA FLOATING POINT
        float inifloat = 3.378f;
        double inidouble = 6.2;
        
        //KODE LITERAL
        int decimalInt = 10;
        int hexDecimal = 0xfffff;
        int binDecimal = 0b1010010;
        
        //KODE UNDERSCORE
        long balance = 1_000_000_000;
        int sum = 60_000_000;
        
        // CONFERSI TIPE DATA NUMBER
        //WADING (DARI KECIL KE BESAR)
        byte iniByte = 10;
        short iniShort = iniByte;
        //NARROW (DARI BESAR KE KECIL)
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // HATI-HATI ADA NUMBER OVERFLOW (-127 KE 128 TRUS BERULANG SAMPAI 1000)
*/
 /*       
        //TIPE DATA KARAKTER
        char s ='S';
        char a ='a';
        char h ='h';
        char a2 ='a';
        char l ='l';
        System.out.print(s);
        System.out.print(a);
        System.out.print(h);
        System.out.print(a2);
        System.out.print(l);
        System.out.println("");
        
        // TIPE DATA BOOLEAN
        boolean benar = true;
        boolean salah = false;
        
        System.out.println(benar);
        System.out.println(salah);
        
        //TIPE DATA STRING
        String firstName = "Muhammad Sahal";
        String lastName = " Nurdin";
        
        System.out.print(firstName);
        System.out.println(lastName);
        
        // MENGGABUNGKAN LEBIH DARI SATU STRING
        String fullName = firstName + lastName;
        System.out.println(fullName);
        
        // VARIABLE
        String name;
        name = "Muhammad Sahal Nurdin";
        System.out.println(name);
        int age = 18;
        String address = "Indonesia";
        
        System.out.println(age);
        System.out.println(address);
        
        // KATA KUNCI VAR
        //var nama; //ERROR
        //var nama = "Muhammad Sahal Nurdin";
        // final var nama = "Muhammad Sahal Nurdin";
        
        // KATA KUNCI FINAL atau KONSTAN
        final double PI =3.14;
        final String nama = "Muhammad Sahal Nurdin";
        
        //TIPE DATA BUKAN PRIMITIF / OBJEK (STRING,CLASS)
        // Byte, Long , Short, Integer, Float, Double
        
        Integer iniInteger = 1000;
        Byte iniBytes = null;
        System.out.println(iniBytes);
        Byte iniByte; //ERROR
        
        //KONVERSI DARI PRIMITIF KE OBJEK
        int i =100;
        Integer x = i;
        //KONVERSI DARI OBJEK KE PRIMITIF
        int y = x;
        // JIKA BEDA TIPE DATA
        short shorti = x.shortValue(); //MEMAKAI OBJECT SIMBOLNYA ADA TITIK
        byte bytei = x.byteValue();
        
*/
        
        //TIPE DATA ARRAY ATAU LARIK(KUMPULAN DATA YANG SAMA)
        //CARA 1
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Muhammad";
        stringArray[1] = "Sahal";
        stringArray[2] = "Nurdin";
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        //CARA 2
        int[] arrayInt= new int[]{
            1, 2, 3, 4, 5
        };
        //CARA 3
        long[] arrayLong = {
            10L, 20L, 30L, 40L
        };
        System.out.println(arrayInt[0]);
        System.out.println(arrayLong.length);
        
        // TIDAK ADA PENGHAPUSAN NILAI ARRAY
        
        // ARRAY 2D
        String [][] nama;
        nama = new String[][]{
            {"Muhammad", "Sahal"}, {"Nurdin", "gans"}
        };
        System.out.println(nama[0][0]);
        System.out.println(nama[1][0]);
        
        // OPERASI MATEMATIKA (+, -, /, %, *)
        int a = 100;
        int b =80;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        // AUGMENTED ASSIGNMENT (KEDIRINYA SENDIRI)
        int c = 100;
        c+=10;
        System.out.println(c);
        c-=10;
        System.out.println(c);
        c*=10;
        System.out.println(c);
        c/=10;
        System.out.println(c);
        c%=10;
        System.out.println(c);
        
        //UNARY OPERATOR(++, --, -, +, !)
        int v = 100;
        v++;
        System.out.println(v);
        v--;
        System.out.println(v);
        
        //OPERASI PERBANDINGAN(>, < , <=, >=, ==,!=)
        int value1 = 100;
        int value2 = 100;
        
        System.out.println(value1 < value2);
        System.out.println(value1 > value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 != value2);
        System.out.println(value1 == value2);
        
        
        // OPERASI BOOLEAN (&&, ||, !)
        int absen = 80;
        int nilaiAkhir = 80;
        
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        
        boolean lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
        
        
        
        
        
        
        
        
        
    }
}

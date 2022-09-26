import java.io.*;
public class AljabBool 
{
    public static void main(String[] args)throws Exception
    {
        //Ajabar Boolean
        int a, b;
        int pil;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ALJABAR BOOLEAN\n\n");
        System.out.print("Masukkan nilai a (1 atau 0) : ");
        a = Integer.parseInt(input.readLine());
        System.out.print("\nMasukkan nilai b (1 atau 0) : ");
        b = Integer.parseInt(input.readLine());
        if ((a > 1) || (b > 1)) {
            System.out.println("\nMaaf inputan Anda salah");
        } else {
            while (true) {
                System.out.print("\nMenu Pilihan\n" +
                        "1.AND\t\t=\n" +
                        "2.OR\t\t=\n" +
                        "3.NAND\t\t=\n" +
                        "4.NOR\t\t=\n" +
                        "5.EXOR\t\t=\n" +
                        "6.EXNOR\t\t=\n" +
                        "7.Exit\t\t=\n" +
                        "\nPilih menu: ");
                pil = Integer.parseInt(input.readLine());
                System.out.println("\n");
                switch (pil) {
                    case 1:
                        System.out.print("Hasil dari (a AND b) atau (a.b) : ");
                        if (a == 1 && b == 1) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                        break;
                    case 2:
                        System.out.println("Hasil dari (a OR b) atau (a+b) : ");
                        if (a == 0 && b == 0) {
                            System.out.print("0");
                        } else {
                            System.out.print("1");
                        }
                        break;
                    case 3:
                        System.out.print("Hasil dari (a NAND b) atau (a.b)^ : ");
                        if (a == 1 && b == 1) {
                            System.out.print("0");
                        } else {
                            System.out.print("1");
                        }
                        break;
                    case 4:
                        System.out.print("Hasil dari (a NOR b) atau (a+b)^ : ");
                        if (a == 0 && b == 0) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                        break;
                    case 5:
                        System.out.print("Hasil dari (a EXOR b) atau (a X b) : ");
                        if (a == 1 && b == 1 || a == 0 && b == 0) {
                            System.out.print("0");
                        } else {
                            System.out.print("1");
                        }
                        break;
                    case 6:
                        System.out.print("Hasil dari (a EXNOR b) atau (a X b)^: ");
                        if (a == 1 && b == 1 || a == 0 && b == 0) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                        break;
                    case 7:
                        System.out.println("\nTERIMA KASIH");
                    default:
                }
                if(pil == 7){
                    break;
                }
                System.out.println("\n");
            }
        }
    }
}



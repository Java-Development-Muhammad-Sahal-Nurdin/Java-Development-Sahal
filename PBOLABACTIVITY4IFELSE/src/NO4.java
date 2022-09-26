import java.util.Scanner;

public class NO4 
{
     public static void main(String[] args)
    {
        int PIN1;
        int PIN2; 
        int PIN3;
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan PIN Anda: ");
        PIN1 = input.nextInt();

        if (PIN1 == 1234) {
            System.out.print("PIN yang Anda masukkan benar.");
    }else{
        System.out.println("PIN yang Anda masukkan salah.");
        System.out.print("Masukkan kembali PIN Anda: ");
        PIN2 = input.nextInt();
        if (PIN2 == 1234){
            System.out.print("PIN yang Anda masukkan benar.");
        }else {
            System.out.println("PIN yang Anda masukkan salah.");
            System.out.print("Masukkan kembali PIN Anda: ");
            PIN3 = input.nextInt();
            if (PIN3 == 1234){
                System.out.print("PIN yang Anda masukkan benar.");
            }else {
                System.out.println("PIN yang Anda masukkan salah.");
                System.out.print("Kartu ATM Anda terblokir.");
            }
        }
    }
    }
}


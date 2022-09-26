
import java.util.Scanner;


public class ReturnObject 
{
    public static void main(String[] args) 
    {
        RekeningBank rekening;
        rekening = getRekening();
        
        System.out.printf("Rekening mempunyai saldo Rp.%,.2f\n", rekening.getSaldo());
        
    }
    public static  RekeningBank getRekening()
    {
        double saldo;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan saldo awal: ");
        saldo = keyboard.nextDouble();
        
        return new RekeningBank(saldo);
        
    }
}

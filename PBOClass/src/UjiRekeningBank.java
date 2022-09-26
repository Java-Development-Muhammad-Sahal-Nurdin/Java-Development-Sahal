import java.util.Scanner;
public class UjiRekeningBank 
{
    public static void main(String[] args) 
    {
        String input;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Berapa saldo awal dari rekening Anda: ");
        input =keyboard.nextLine();
        
        RekeningBank rekening = new RekeningBank(Double.parseDouble(input));
        
        System.out.println("Berapa gaji Anda bulan ini? ");
        input = keyboard.nextLine();
        rekening.deposit(Double.parseDouble(input));
        
        System.out.println("Gaji Anda telah didepositkan ");
        System.out.printf("Saldo Anda sekarang adalah Rp.%,.2f\n", rekening.getSaldo());
        
        System.out.println("Berapa jumlah yang and ingin tarik?");
        input = keyboard.nextLine();
        
        rekening.withdraw(Double.parseDouble(input));
        
        System.out.printf("Saldo Anda sekarang = Rp. %,.2f", rekening.getSaldo());
        
        
        
    }
}

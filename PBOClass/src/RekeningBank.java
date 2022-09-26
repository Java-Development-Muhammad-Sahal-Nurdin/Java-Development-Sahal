
public class RekeningBank 
{
    private double saldo; // Saldo bank
    
    public RekeningBank()
    {
        saldo = 0.0;
    }
    public RekeningBank(double saldoAwal)
    {
        saldo = saldoAwal;
    }
    public void deposit(double jumlah)
    {
        saldo =saldo + jumlah;
    }
    public void withdraw(double jumlah)
    {
        if( saldo >= jumlah)
        {
            saldo = saldo  -jumlah;
        }
        else
        {
            System.out.println("Dana tidak tercukupi");
        }
    }
    public void setSaldo(double s)
    {
        saldo = s;
    }
    public double getSaldo()
    {
        return saldo;
    }
}

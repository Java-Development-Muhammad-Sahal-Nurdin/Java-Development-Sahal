
public class PassObject2 
{
    public static void main(String[] args) 
    {
        PersegiPanjang boks = new PersegiPanjang(12.0, 5.0);
        System.out.println("Isi dari object boks: ");
        System.out.println("Panjang =  " + boks.getPanjang() +
                                    "Lebar =  " + boks.getLebar());
        
        ubahPersegiPanjang(boks);
        System.out.println("\n nilai dari object boks sekarang: ");
        System.out.println("Panjang =  " + boks.getPanjang() +
                                    "Lebar =  " + boks.getLebar());
    }
    public static void ubahPersegiPanjang(PersegiPanjang r)
    {
        r.setPanjang(0.0);
        r.setLebar(0.0);
    }
}

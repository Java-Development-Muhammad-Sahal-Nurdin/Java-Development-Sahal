
public class PassObject 
{
    public static void main(String[] args) 
    {
        PersegiPanjang boks = new PersegiPanjang(12.0, 5.0);
        tampilkaPersegiPanjang(boks);
                
    }
    public static void tampilkaPersegiPanjang(PersegiPanjang r)
    {
        System.out.println("Panjang = " + r.getPanjang() + 
                                    "Lebar = " + r.getLebar());
    }
}


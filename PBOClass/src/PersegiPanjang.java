/* 
    Class PersegiPanjang thap 1 
    sedang dalam pengerjaan!
*/
public class PersegiPanjang 
{
    // INI ADALAH SEBUAH FIELD (INSTANCE FIELD)
    private double panjang;         
    private double lebar;
    
    /*
        Constructor 
        @param pjg panjang dari persegi panjang
        @param lbr lebar dari persegi panjang
   */
    public PersegiPanjang(double pjg, double lbr)
    {
        panjang = pjg;
        lebar =lbr;
    }
    
    /*
    Method setPanjang menyimpan sebuah nilai 
    ke field panjang
    @param lebar nilai yang disimpan dalam filed lebar
    */
    public void setPanjang(double pjg) // Ini adalah mutator atau setter yang mrubah nilai
    {                                             // Fungsi void di sini adalah untuk return nilai field
        panjang = pjg;
    }
    /*
    Method setLebar menyimpan sebuah nilai 
    ke field lebar
    @param lebar nilai yang disimpan dalam filed lebar
    */
    public void setLebar(double lbr)    // Ini adalah mutator atau setter yang mrubah nilai
                                                   // Fungsi void di sini adalah untuk return nilai field
    {
        lebar = lbr;
    }
    /*
    Method getPanjang mengembalikan panjang dari 
    object persegi panjang.
    @return nilai dari field panjang
    */
    public double getPanjang()
    {
        return panjang;
    }
     /*
    Method getLebar mengembalikan lebar dari 
    object PersegiPanjang.
    @return nilai dari field lebar
    */
    public double getLebar()
    {
        return lebar;
    }
    /*
    Method getLebar mengembalikan luas dari 
    object PersegiPanjang.
    @return hasil dari panjang kali lebar
    */
    public double getLuas()
    {
        return panjang*lebar;
    }
}

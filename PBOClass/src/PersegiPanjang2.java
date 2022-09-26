
public class PersegiPanjang2 
{
    private double panjang;
    private double lebar;
    
    public PersegiPanjang2()
            {
                panjang = 0.0;
                lebar  = 0.0;
            }
    public PersegiPanjang2(double panjang, double lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        
        public PersegiPanjang2(double sisi )
        {
            this(sisi, sisi);
            
        }
        public void setPanjang(double panjang)
        {
            this.panjang = panjang;
            
        }
        public void setLebar(double lebar)
        {
            this.lebar = lebar;
            
        }
        public double getPanjang()
        {
            return panjang;
        }
        public double getLebar()
        {
            return lebar;
        }
        public double luas()
        {
            return panjang * lebar;
        }
}

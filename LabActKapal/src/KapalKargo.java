// MUHAMMAD SAHAL NURDIN
// 1IA12

/**
 *
 * @author hp
 */
public class KapalKargo extends Kapal
{
    private int kapasitasAngkut;
    KapalKargo(String nama, int tahunPembuatan, int kapasitasAngkut) 
    {
       super(nama, tahunPembuatan);
       this.kapasitasAngkut = kapasitasAngkut;
    }
    public int getKapasitasAngkut()
    {
    return kapasitasAngkut;
    }@Override
    public String toString(){
        return "Nama: "+super.getNama()+"\nKapasitas Angkut: "+this.kapasitasAngkut;
    }
}

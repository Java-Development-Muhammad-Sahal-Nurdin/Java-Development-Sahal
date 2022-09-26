// MUHAMMAD SAHAL NURDIN
// 1IA12
/**
 *
 * @author hp
 */
public class Kapal 
{
    private String nama;
    private int tahunPembuatan;
    Kapal(String nama, int tahunPembuatan)
    {
    this.nama = nama;
    this.tahunPembuatan = tahunPembuatan;
    } 
    public String getNama()
    {
        return nama;
    }@Override
    public String toString()
    {
        return "Nama: "+nama+"\nTahun Pembuatan: "+tahunPembuatan;
    }
}


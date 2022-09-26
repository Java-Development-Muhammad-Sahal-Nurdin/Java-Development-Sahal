// MUHAMMAD SAHAL NURDIN
// 1IA12
/**
 *
 * @author hp
 */
public class KapalPesiar extends Kapal
{
    private int maksPenumpang;
    
    KapalPesiar(String nama, int tahunPembuatan, int maksPenumpang) 
    {
        super(nama, tahunPembuatan);
        this.maksPenumpang = maksPenumpang;
    }
public int getMaksPenumpang()
{
        return maksPenumpang;
    }@Override
    public String toString()
    {  
        return "Nama: "+super.getNama()+"\nMaks. Penumpang: "+this.maksPenumpang;
    }
    
}


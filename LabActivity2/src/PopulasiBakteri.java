/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class PopulasiBakteri {
    public static void main (String[] args)
    {
        int popAwal = 150000;   // Populasi awal
        int t = 10;             // Durasi waktu
        int popAkhir;           // Untuk menyimpan populasi akhir
        
        // [1] Hitung populasi akhir.
        // Populasi akhir harus dalam nilai bulat.
        double MyDouble= popAwal*Math.pow(Math.E, 0.5*t);
        popAkhir = (int) MyDouble;
        
        // [2] Cetak populasi awal dan populasi akhir.
        System.out.println("Populasi awal = " + popAwal);
        System.out.println("Populasi akhir = " + popAkhir);

    }
    
}

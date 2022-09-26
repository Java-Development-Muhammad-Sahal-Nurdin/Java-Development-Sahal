/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class PersamaanKuadrat {
    public static void main (String[] args )
    {
        // [1] Deklarasikan dua variabel untuk menyimpan akar persamman kuadrat 
        double x1, x2;
        
        int a = 2;
        int b = 4;
        int c = -18;
        
        // [2] Hitung dua akar persaman kuadrat 
        x1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a *c);
        x2 = -b - Math.sqrt(Math.pow(b, 2) - 4 * a *c);
        
        double hasil1 = x1 / 4;
        double hasil2 = x2 / 4;
        
        //Tampilkan akar persamaan kuadarat 
        System.out.println("x1 = " + hasil1);
        System.out.println("x2 = " + hasil2);
        
                
    }
    
}

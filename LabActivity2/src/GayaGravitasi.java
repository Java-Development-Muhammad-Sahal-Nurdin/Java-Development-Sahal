/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class GayaGravitasi {
    public static void main(String[] args)
    {
        final double GRAVITASI = 6.6748-11; //Konstanta Gravitasi
        double m1= 40, m2 = 30;// Massa objek 1 dan objek 2
        double r = 2; // Jarak antara objek 1 dan objek 2
        double force;// Gaya tarik gravitasi 
     
        // Tuliskan kode Anda di bawah!
        force = ( GRAVITASI * m1 * m2)/Math.pow(r, 2);
        
        //Tampilan gaya gravitasi 
        System.out.println("F = " + force);
    }
    
    
}

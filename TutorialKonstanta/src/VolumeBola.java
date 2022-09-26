/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class VolumeBola {
    public static void main (String[] args)
    {
        //Deklarasi dua variabel untuk menyimpan nilai jari-jari dan volume bola
        double r, volume;
        
        r=3;
        
        //Menghitung volume bola
        volume = (4.0/3.0) * Math.PI*Math.pow(r, 3);
        System.out.println(volume);
    }
    
}

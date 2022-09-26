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
        double r = 7.5; //Jari-jari bola
        double volume; //Untung menyimpan hasil perhitungan volume bola
        
        //[1] Hitumg volume bola
        volume = (4.0 / 3.0)*Math.PI*Math.pow(r, 3.0);
        
        //[2] Tampilan volume bola 
        System.out.println("Volume bola = " + volume);
        
    }
    
}

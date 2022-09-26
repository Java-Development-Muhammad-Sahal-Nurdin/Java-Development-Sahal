/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class MataUang {
    public static void main (String[] args)
    {
        double harga = 450000;
        int banyak = 5;
        
        double total = harga * banyak;
        
        
        System.out.printf("Total pembelian: Rp.%,.2f\n", total);
    }
    
}

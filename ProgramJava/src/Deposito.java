/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Deposito {
    public static void main(String[] args)
    {
        double deposito = 125500.00;
        double bunga = 0.0475;
        
        System.out.print("Deposito awal: ");
        System.out.println(deposito);
        
        // Menghitung deposito 1 tahun
        deposito *= (1+bunga); // deposito = deposito * (1+ bunga)
        
        System.out.print("Saldo deposito setelah 1 tahun: ");
        System.out.println(deposito);
        
        // Menghitung deposito 2 tahun
        deposito *= (1+bunga); // deposito = deposito * (1+ bunga)
        
         System.out.print("Saldo deposito setelah 2: ");
        System.out.println(deposito);
    }
    
}

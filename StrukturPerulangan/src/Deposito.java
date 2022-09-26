/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Deposito 
{
    public static void main (String[] args)
    {
        final double PERSEN_BUNGA = 0.10;    // Bunga = 10%
        double saldoAwal;                         // Untuk menyimpan saldo awal
        double saldoBerjalan;                   // Untuk menyimpan saldo berjalan
        double bunga;                              // Untuk menyimpan jumlah bunga
        int tahun;                                  // Untuk menyimpan tahun
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal deposito : ");
        saldoAwal = keyboard.nextDouble();
        
        // Tetapkan tahun mulai dengan 0 dan saldo dengan setoran
        tahun = 0;
        saldoBerjalan = saldoAwal;
        
        // Loop untuk menghitung saldo berjalan 
        while (saldoBerjalan <= 2 * saldoAwal)
        {
            tahun++;
            bunga = PERSEN_BUNGA* saldoBerjalan;
            saldoBerjalan = saldoBerjalan + bunga;
            
        }
            System.out.println("Deposito Anda akan bertambah dua kali lipat" + 
                                       " setelah: " + tahun + " tahun.");
            System.out.printf("Saldo akhir = Rp. %,.2f\n", saldoBerjalan);
        }
    }


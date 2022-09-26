/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DemoAritmatika {
    public static void main(String[] args)
    {
        int op1, op2; // Operand 1 dan Operand 2
        int jumlah, selisih, kali, bagi, modulus; //Untuk menyimpan hasil operasi aritmatika
                
        //Tugaskan nilai ke operand 1 dan operand 2
        op1 = 74;
        op2 = 31;
        
        //Cetak nilai variabel
        System.out.print("op1= ");
        System.out.println(op1);
        System.out.print("op2= ");
        System.out.println(op2);
        
        //Operasi Penjumlahan
        jumlah = op1+op2;
        System.out.print("op1 + op2 = ");
        System.out.println(jumlah);
        
        //Operasi Pengurangan
        selisih = op1-op2;
        System.out.print("op1 - op2 = ");
        System.out.println(selisih);
        
        //Operasi Pemabagaian
        bagi = op1 / op2;
        System.out.print("op1 / op2 = ");
        System.out.println(bagi);
        
        //Operasi Perkalian
        kali = op1*op2;
        System.out.print("op1*op2 = ");
        System.out.println(kali);
        
        //Operasi Modulus
        modulus = op1 % op2;
        System.out.print("op1%op2 = ");
        System.out.println(modulus);
        
        //Operasi Negasi
        System.out.print("-op1 = ");
        System.out.println(-op1);
        
        

                
    }
    
}

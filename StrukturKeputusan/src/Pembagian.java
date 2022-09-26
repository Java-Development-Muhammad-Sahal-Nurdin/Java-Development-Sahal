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
public class Pembagian 
{
    public static void main(String[] args)
    {
       double num1, num2;
       double hasilbagi;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan angka terbagi: ");
        num1 = keyboard.nextDouble();
        
         System.out.print("Masukkan angka terbagi: ");
        num2 = keyboard.nextDouble();
        
      if ( num2 == 0)
      {
          System.out.println("Pembagian dengan nol tidak mungkin");
          System.out.println("Silahkan jalankan kembali program dan");
          System.out.println("Masukkan angka pembagi selain nol");
      }
        else
      {
          hasilbagi = num1/num2;
                  System.out.print("Angka" + num1);
                  System.out.print("Dibagi dengan " + num2);
                  System.out.print(" menghasilkan " + hasilbagi);
      }
        
    }
}

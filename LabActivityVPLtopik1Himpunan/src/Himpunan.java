/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;

public class Himpunan {
    
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        
        int[] himpunanA = new int [100];
        int[] himpunanB = new int [100];
        int jumlahElemenA;
        int jumlahElemenB;

        try{
            // Input angka dari user
            System.out.print("Masukkan banyak elemen 'A': ");
            jumlahElemenA = input.nextInt();

            // Looping untuk memasukan elemen himpunan
            for(int i = 1; i <= jumlahElemenA; i++){
                System.out.print("Masukkan elemen ke-"+i+": ");
                himpunanA[i] = input.nextInt();
            }
            
            // Looping output dari elemen himpunan
            System.out.print("A={");
            for(int i = 1; i <= jumlahElemenA; i++ ){
                System.out.print(himpunanA[i]);
                if (i < jumlahElemenA){
                    System.out.print(",");
                }
            }
            System.out.println("}\n");

            // Bagian himpunan B

            System.out.print("\nMasukkan banyak elemen 'B': ");
            jumlahElemenB = input.nextInt();

            for(int i = 1; i <= jumlahElemenB; i++){
                System.out.print("Masukkan elemen ke-"+i+": ");
                himpunanB[i] = input.nextInt();
            }
            
            System.out.print("B={");
            for(int i = 1; i <= jumlahElemenB; i++ ){
                System.out.print(himpunanB[i]);
                if (i < jumlahElemenB){
                    System.out.print(",");
                }
            }
            System.out.println("}\n");

            System.out.print("\nJadi irisannya adalah {");
            for(int i = 1; i <= jumlahElemenB; i++){
                for(int j = 1; j<= jumlahElemenA; j++){
                    boolean adaSama = false;
                    if (himpunanB[i] == himpunanA[j]){
                        adaSama = true;   
                    }
                    if (adaSama == true){
                        System.out.print(himpunanB[i]+",");
                    }
                }  
            }
            System.out.println("}");
        }
        finally{
            input.close();
        }
    }

}
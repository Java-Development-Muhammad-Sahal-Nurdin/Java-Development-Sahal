/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sahal.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class halo {
    public static void main(String[] args) throws IOException {
        //Ketikkan angka di samping tanda titik dua
        System.out.print("Ketikkan Angka :");
        
            InputStreamReader is = new InputStreamReader(System.in); 
            BufferedReader br = new BufferedReader(is);
           
            int s = Integer.parseInt(br.readLine());
            if (s < 50){
                    System.out.println("Nilai kurang dari 50");}
                else if (s > 50){
                    System.out.println("Nilai lebih dari 50");}
                else{
                    System.out.println("Nilai sama dengan 50");{
                   }}  
            
        }}
        
    
  
    

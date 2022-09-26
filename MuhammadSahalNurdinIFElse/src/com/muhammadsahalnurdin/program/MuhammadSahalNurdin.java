/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhammadsahalnurdin.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class MuhammadSahalNurdin {

    public static void main(String[] args) throws IOException {
        
        System.out.print("Masukkan angka :");
        
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (is);
        
            int s = Integer.parseInt(br.readLine());
            if (s < 50){
                    System.out.println("Nilai kurang dari 50");}
                else if (s > 50){    
                    System.out.println("Nilai lebih dari 50");}
                else{
                    System.out.println("Nilai sama dengan 50");{
                    }}
    
}}

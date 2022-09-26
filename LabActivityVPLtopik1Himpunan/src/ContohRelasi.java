/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author hp
 */
public class ContohRelasi {
    public static void main (String[] args) throws Exception
    {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        {
                System.out.println("Jenis Relasi Refleksif");
        }
                System.out.print("Masukkan banyak himpunan 'A': ");
                String s = input.readLine();
                int x = Integer.parseInt(s);
                int himpA [] = new int [x];
                for(int i = 0; i<x; i++)
                {
                    System.out.print("Masukkan elemen 'A' ke- "+(i+1)+": ");
                String a = input.readLine();
                himpA [i] = Integer.parseInt(a);

                }

                {
                System.out.println();
                System.out.println();
                System.out.print("A={");
        for (int i=0; i<x; i++)
            {
                System.out.print(himpA[i]);
                if(i != x-1)
                System.out.print(",");
            }
        System.out.println("}");
        System.out.println();
                System.out.println();
                }
                System.out.print("Refleksif dari himpunan A = {");
                for (int i=0; i<x; i++)
                {
                    for (int j=0; j<x; j++)
                    {
                        if (himpA [i] == himpA[j])
                        {
                            System.out.print("("+himpA [i]+","+himpA [j]+")");
                            if (j != x-1)
                            {
                                System.out.print(",");
                            }
                        }
                    }
                }
                System.out.println("}");

    }

    }
    

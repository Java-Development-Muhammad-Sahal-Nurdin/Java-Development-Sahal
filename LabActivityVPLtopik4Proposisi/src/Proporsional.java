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
public class Proporsional 
{
    public static void main(String[] args) throws Exception
    {
        
	    // Deklarasi variabel 
		int p,q;
		int pil;
		
		// Fungsi dari BufferredReader ini adalah untuk menangkap inputan dari keyboard
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in)); 
                       System.out.println("Program Proporsional\n");
		
		// Menanyakan nilai P, input dari user
		System.out.print("Masukan nilai P (0 atau 1) : ");
		p = Integer.parseInt(input.readLine());
		
		// Menanyakan nilai Q, input dari user
		System.out.print("Masukan nilai Q (0 atau 1) : ");
		q = Integer.parseInt(input.readLine());
		if((q>1) || (p>1))
		{
			System.out.println("Maaf inputan Anda salah");
		}
		else 
		{
                                System.out.println("\tMenu Pilihan");
		    // Menampilkan pilihan menu kepada user untuk melakukan aksi
			System.out.println("=1.Konjungsi\t=");
			System.out.println("=2.Disjungsi\t=");
			System.out.println("=3.Kondisional\t=");
			System.out.println("=4.Bikondisonal\t=");
                                 System.out.println("=5.Exit\t\t=");
			System.out.print("Pilih menu: ");
			pil = Integer.parseInt(input.readLine());
			
			switch (pil)
			{
			    // Menampilkan perintah konjungsi jika user pilih 1
				case 1:				
					if((p == 1)&&(q == 1))
					{
						System.out.println("Hasil dari P ^ Q : 1");
						
					}
					else
					{
						System.out.println("Hasil dari P ^ Q : 0");
						
					}
					break;
				
				// Menampilkan perintah disjungsi jika user pilih 2
				case 2:				
					if((p == 0)&&(q == 0))
					{
						System.out.println("Hasil dari P v Q : 0");
						
					}
					else 
					{
						System.out.println("Hasil dari P v Q : 1");
						
					}
					
					break;
				
				// Menampilkan perintah kondisional jika user pilih 3
				case 3:				
					if((p == 1)&&(q == 0))
					{
						System.out.println("Hasil dari P -> Q : 0");
						
					}
					else 
					{
						System.out.println("Hasil dari P -> Q : 1");
						
					}
					break;
				
				// Menampilkan perintah biimplikasi jika user pilih 4
				case 4:				
					if(((p == 1)&&(q == 1))||((p == 0)&&(q == 0)))
					{
						System.out.println("Hasil dari P <-> Q : 1");
						
					}
					else 
					{
						System.out.println("Hasil dari P <-> Q : 0");
						
					}
					
					break;
                                            case 5:
                                                System.exit(0);
                                                break;
                                            
				// Menampilkan jika user input selain 1,2,3,4
				default:					
					System.out.println("Salah inputan");
					break;
			}
		}
			
	}
}


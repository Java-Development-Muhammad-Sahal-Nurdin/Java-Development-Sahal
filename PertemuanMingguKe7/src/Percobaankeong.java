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
public class Percobaankeong 
{
    public static void main(String[] args)
    {
    
        Scanner input;
        input = new Scanner(System.in);
        int nilai, a, b, c, d, e;

        a = 1;
        b = 1;
        c = 1;
        d = 1;

        System.out.println("\n- - - Tugas Membuat Wajik - - -");
        System.out.println("Input panjang setengah diagonal : ");
        nilai = input.nextInt();
        while (a <= (nilai*2)-1) {
            System.out.printf("loop ke - " + a + " ");
            ////kuning
            if(a <= nilai){
                while (c <= nilai - a) {
                    System.out.printf("  ");
                    c++;
                }
                while (b <= nilai) {
                    System.out.printf("@ ");
                    if (a == b) {
                        break;
                    }
                    b++;
                }
                ////biru
                while (d <= nilai) {
                    if (d == a) {
                        break;
                    }
                    System.out.printf("@ ");
                    if (a == d - 1) {
                        break;
                    }
                    d++;
                }
            }
            if(a > nilai){
                ////hijau
                while ( c <= nilai){
                    if (c == a - nilai + 1){
                        break;
                    }
                    System.out.printf("  ");
                    c++;
                }
                while ( b <= nilai){
                    System.out.printf("@ ");
                    if (a + b == nilai + 5){
                        break;
                    }
                    b++;
                }
                ///merah
                while (d <= nilai){
                    if(a == 9){
                        break;
                    }
                    System.out.printf("@ ");
                    if (a + d == 9){
                        break;
                    }
                    d++;
                }
            }
            a++;
            b = 1;
            c = 1;
            d = 1;
            System.out.println("");
        }
    }
}
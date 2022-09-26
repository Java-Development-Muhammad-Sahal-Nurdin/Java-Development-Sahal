
package com.latihan1.program;
import java.util.Scanner;
public class swtch {
   //switch case 
    public static void main(String[] args) {
      
        
            String input;
            Scanner inputuser =new Scanner(System.in);
            System.out.println("panggil nama");
        input = inputuser.next();
      
            System.out.println(input);
            
            switch(input){
                case"sahal":
                    System.out.println("saya sahal dan saya hadir");
                    break;
                case "binjai":
                    System.out.println("salam dari binjai");
                default:
                     System.out.println(input+"salam dari binjai dong");
                
            }
            
            
    }
    
}

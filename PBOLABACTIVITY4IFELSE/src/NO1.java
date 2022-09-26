import java.util.Scanner;
public class NO1 
{
    public static void main(String[] args)
    {
  
        double a, b, c;
        double x1, x2, hasil1, hasil2;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        a = input.nextDouble();
        
        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();

        x1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c); 
        x2 = -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c); 

        hasil1 = x1 / (2 * a);
        hasil2 = x2 / (2 * a); 
        
       if (b > 2.0 || b < -2.0){
            System.out.printf("x1 = %01.2f\n",hasil1);
            System.out.printf("x2 = %01.2f\n",hasil2);
        }
        
        else if (b >= 2.0 || b <= -2.0){
            if (a < 2){
                System.out.printf("x1 = %01.2f\n",hasil1);
                System.out.printf("x2 = %01.2f\n",hasil2);
            }
            else {
                System.out.println("Akar-akar dari persamaan kuadrat adalah imajiner.");
            }
            
        }
        else {
            System.out.println("Akar-akar dari persamaan kuadrat adalah imajiner.");
        }
        
    }
}
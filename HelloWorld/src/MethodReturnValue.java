
public class MethodReturnValue 
{
    public static void main(String[] args) 
    {
         int result1  = sum(100, 100);
        System.out.println(result1);
        System.out.println(sum(200, 200));
    }
   static int sum(int value1, int value2)
   {
       int total = value1 + value2;
       return total;
   }
}


public class RecursiveMethod 
{
    public static void main(String[] args) 
    {
        System.out.println(factorialLoop(5));
        
    }
    static int factorialLoop(int value)
    {
        int result =1;
        
        for(int counter =1; counter <= value; counter++)
        {
            result*=counter;
        }
        return result;
    }
}


 
public class MethodVariableArgument 
{
    public static void main(String[] args) 
    {
        int [] values = {90,90,90,80,100};
        sayCongrats("Sahal", values);
                
    }
    static void sayCongrats(String name, int... values)
    {
        int total = 0;
        for(int value : values)
        {
            total += value;
        }
        int finalValue = total / values.length;
        
        if(finalValue >= 75)
        {
            System.out.println("Selamat " + name + " Anda lulus");
        }
        else
        {
            System.out.println("Maaf " + name + " Anda tidak lulus");
        }
               
    }
}

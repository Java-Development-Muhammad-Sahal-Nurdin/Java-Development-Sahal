
public class MethodOverloading 
{
    public static void main(String[] args) 
    {
        sayHello();
        sayHello("Sahal");
        sayHello("Sahal", " Nurdin");
    }
    static void sayHello()
    {
        System.out.println("Hello");
    }
    static void sayHello(String nama)
    {
        System.out.println("Hello " + nama);
        
    }
    static void sayHello(String firstName, String lastName)
    {
        System.out.println("Hello " + firstName + lastName);
    }
}

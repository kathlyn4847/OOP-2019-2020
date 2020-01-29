package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        int i;
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism

        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  

        Cat topcat = new Cat();
        topcat.speak();

        for (i= 9 ; i>0 ; i--)
        {
         topcat.kill();
        }
    }
}
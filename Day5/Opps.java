
class Opps{
    public static void main(String[]args)
    {
        Car c = new Car();
        c.name = "Form";
        c.Color = "Red"; 
        System.out.println("Car Details");
        System.out.println("Car Brand:" +c.name);
        System.out.println("Color:" +c.Color);
        c.bark();

         Car c1 = new Car();
        c1.name = "cnyiew";
        c1.Color = "white"; 
        System.out.println("Car Details");
        System.out.println("Car Brand:" +c1.name);
        System.out.println("Color:" +c1.Color);
        c1.bark();

    }
    
}

class Car
{
    String name;
    
    String Color;
    void bark()
    {
        System.out.println("Bow..Bow...");
    }
}
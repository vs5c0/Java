
class CarApp {
    public static void main(String[]args)
    {
        Car c = new Car();
        c.Brand = "Fortune";
        c.Price = 1490879969;
        c.Color = "Red"; 
        System.out.println("Car Brand:" +c.Brand);
        System.out.println("Price:" +c.Price);
        System.out.println("Color:" +c.Color);
        c.accelerate();

    }
    
}

class Car
{
    String Brand;
    int Price;
    String Color;
    void accelerate()
    {
        System.out.println("A Car Accelerate.....");
    }
}
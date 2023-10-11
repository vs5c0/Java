package Oops;


class Bike 
{
    void run()
    {
        System.out.println("Running");
    }
}
class Hero extends Bike 
{
    void run()
    {
        System.out.println("Bike is Running at 70kmph");
    }
}
class Heros extends Bike 
{
    void run()
    {
        System.out.println("Bike is Running at 100kmph");
    }
}


// Polymorphism ---> means a single action in differnt forms
 
// Run Polymorphism--> is a Process of to call a overridden methods to reslove the runtime issues
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Bike ob = new Hero();
        ob.run();

        Bike ob1 =  new Heros();
        ob1.run();
        
        
    }
    
}

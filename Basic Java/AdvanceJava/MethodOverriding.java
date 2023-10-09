package AdvanceJava;


class Vehicle
{
    public void run()
    {
        System.out.println("Bike is Running So Fast");
    }
}
class Bike extends Vehicle
{
    public void run()
    {
        System.out.println("Bike is Safe ");
    }
}
 
// Method Overloading --> if a child class have same method is decalre in parent class
class MethodOverriding {
    public static void main(String[] args) {
        
        Bike ob = new Bike();
        ob.run();
    }
    
}

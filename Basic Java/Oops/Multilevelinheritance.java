package Oops;
class Animal{
    void eat()
{
    System.out.println("Dog is Eating");
}
}
class Dog extends Animal{

    void bark()
    {
        System.out.println("Dog is Barking...");
    }
}
class Baby extends Dog
{
    void shout()
    {
        System.out.println("BabyDog is Shouting....");
    }
    
    
}
 //Multi level inhertance ---> chain of inhertances
public class Multilevelinheritance {
    public static void main(String[] args) {
        
        Baby obj = new Baby();
        obj.shout();
        obj.bark();
        obj.eat();

    }
    
}

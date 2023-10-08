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
class Baby extends Animal
{
    void shout()
    {
        System.out.println("BabyDog is Shouting....");
    }
    
    
}

//Hirerachial inhertance --> 2 or more class inherts the single class

public class Hirarichalinhertance {

    public static void main(String[] args) {
         Baby ob = new Baby();
         ob.shout();
         ob.eat();
        
    }

   
    
    
    
}


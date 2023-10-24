package Oops;
/*
 * Abstraction ---> one of the pillar of OOPs
 * --> In java Abstraction is a process of hiding the information provided by user and show the functionally of the user
 * --> There are mainly two ways to achieve a Abstraction
 * 1 .Abstract class
 * 2 .Interface
 * 
 * Abstract class --->  A class can be declared by using abstract keyword is called abstract class
 * --> can't be instantiazed 
 * --> having Constructors and static methods
 * 
 * Abstract Method--->  A Method can be defined by abstract but can't be implemented
 
 */

abstract class Bike
{
    abstract void run();
}
class Honda extends Bike
{
    void run()
    {
        System.out.println("Abstract Method : Bike is Running");
    }
}
 class Abstractionclass {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }

    
}

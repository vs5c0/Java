package Oops;


class Animal
{
    public void eat()
    {
        System.out.println("Dog is Eating ....");
    }
}
    class  Dog extends Animal
    {
        public void bark(){
            System.out.println("Dog is Barking.....");
        }
    }

//Single inheritance ---> A class Inherits all the feactures of Super class

 class SingleInheritance {
    public static void main(String[] args) {
        
        Dog ob = new Dog();
        ob.eat();
        ob.bark();


    }
    
}

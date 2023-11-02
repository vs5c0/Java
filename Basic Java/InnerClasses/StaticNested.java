package InnerClasses;
// Static nested class---> is a class created a inside a class
// it can't access the non-static data and methods
// access only outer class names

import InnerClasses.Animal.Repitle;

class Animal
{
    class Repitle
    {
        public void display(){
            System.out.println("It is a Reptile");
        }
    }
    static class Mammal
    {
        public void display()
        {
            System.out.println("It is an Mammal");
        }
    }
}
class StaticNested {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        
        Animal.Repitle re = animal.new Repitle();
        re.display();

        Animal.Mammal mam = new Animal.Mammal();
        mam.display();
    }
    
}

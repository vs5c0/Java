package TypeConversion.Casting;


class Parent
{
    String name;
    void print()
    {
        System.out.println("This is an downcasting parent class");
    }
}
class child extends Parent
{
    int age;
 void print()
 {
    System.out.println("This is an Downcasting child class");
 }

}


/*
 * Downcasting --> is used to access the specific features of the particular object
 * references of a parent class passed to child class
 * access all methods and variables in both class
 */
class Downcasting {

    public static void main(String[] args) {
        
        Parent ob = new child();
        ob.name = "Rama";

        child ob1 = (child)ob;
        ob1.age = 19;

    

        System.out.println("Name of a Person : " +ob.name);
        System.out.println("Age of a Person : " +ob1.age);
           ob1.print();
    }

    
}

package TypeConversion.Casting;

/*
 * Upcasting ---> is used to make code more generalizable
 * it is process of child class object is typecasted to the parent class object
 * we can acesss only some method in child class
 * implicity is possible
 * also called Generalization 
 */

class Employee
{
    void Data()
    {
        System.out.println("This is a Upcasting Parent Class");
    }
}
class Manager  extends Employee
{
    void Data()
    {
        System.out.println("This is a Upcasting child class");
    }
}
class Upcasting {
    public static void main(String[] args) {
        
        Employee ob =  new Manager();
        ob.Data();
    }
}

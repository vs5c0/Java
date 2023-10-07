package Oops;


class Employee //Parent class ---> inherts the Features to the Sub class 
{
    int Salary = 100000;
    int age = 21;;
    String Name = "Vikram Adithya";

}

class Engineer extends Employee //SubClass--> Extends form the Parent class and Extract the Feactures of Parent class
{

    int Bonus = 10000;
    int workingHrs = 7;

}

class Inheritance {
    public static void main(String[] args) {
       
        Engineer ob = new Engineer();
   
        System.out.println("Name of Employee :" +ob.Name);
        System.out.println("Age of Employee :" +ob.age);
        System.out.println("Bonus :" +ob.Bonus);
        System.out.println("Woring hrs of Employee :" +ob.workingHrs);
             System.out.println("Salary :" +ob.Salary);
    }



    
}

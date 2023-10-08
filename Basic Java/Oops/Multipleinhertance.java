package Oops;

class A
{
    void msg()
    {
        System.out.println("This is an Msg");
    }
} 
  class B 
    {
    void msg()
    {
        System.out.println("This is an Another Msg");
    }
   }
    class C extends A // B
    {
    void msg()
    {
        System.out.println("This is an Another Msg");
    }
   }

   //Multiple Inheritance ---> a class having more than two class
   // java can't support --to reduce complexity and Ambiguity

public class Multipleinhertance {
    public static void main(String[] args) {
        C ob = new C();
        ob.msg();
    }
    
}

package AdvanceJava;





class A  extends Object//Super Class(Parent Class)
{
    public  A()  //Default Constructor
    { 
        
        System.out.println("This is a Default Constructor in Super Class");
    }

    public  A(int a) //Parameterized Cons
    {
        
        System.out.println("This is a Default Constructor in Super Class with Parameters");
    }

}
    class B extends A
    
    { //Extended Class from Super Class
        
        public  B()  //Default Constructor
    {
             super();
        System.out.println("This is a Default Constructor in Extended Class");
    }

    public  B(int a)
    {

            
        System.out.println("This is a Default Constructor in Extended Class with Parameters ");
    }


    }
    



 class Super {
    public static void main(String[] args) {
        B obj = new B(2);
    
       

    }


    
    
}

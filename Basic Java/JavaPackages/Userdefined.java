package JavaPackages;


class A
{
    public  void Run()
    {
       System.out.println("Bike is Running");
    }
}
class B extends A
{
    public void Run()
    {
        System.out.println("vehicle is running");
    }
}

class Userdefined {
    public static void main(String[] args) {
        B ob = new B();
        ob.Run();
        
    }


    
}

package Oops;
class Help
{
    public int mul(int a,int b)
    {
        return a*b;
    }

      public int mul(int a,int b,int c)
    {
        return a*b*c;
    }
}
//  CompiletimePolymorphism ---> Is also called Static Polymorphism
//Mainly two types 1 .Function Overloading  2.Operator Overloading

class CompiletimePolymorphism
{
    public static void main(String[] args) {
        Help ob = new Help();
        int r1 = ob.mul(12, 2);
        int r2 =  ob.mul(12, 2, 2);
        System.out.println(r1);
        System.out.println(r2);
    }
}
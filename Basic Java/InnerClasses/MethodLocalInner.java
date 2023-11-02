package InnerClasses;
// Method local inner class --> is a class defined by the method in java
// it can be instantised only method with in the inner class where we defined

class Outer
{
    public void display()
    {
        int num = 25;
        class Inner
        {
         public void print()
         {
            System.out.println("This is an Method local inner class " +num);
        
         }
        }
        Inner obj = new Inner();
        obj.print();

    }
}
    class MethodLocalinner
    {
       public static void main(String[] args) {
        Outer ob = new Outer();
        ob.display();
       }
    }


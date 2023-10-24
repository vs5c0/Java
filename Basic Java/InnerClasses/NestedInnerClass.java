package InnerClasses;
/*
 * Inner Classes --> A class having another class inside then its called inner class
 * Used to make code clean and readable
 * It can acess the outer class methods and private data members and methods
 * there are mainly 4 types of inner classes
 * 1.Nested inner class
 * 2.Method Local
 * 3.Static
 * 4.Anonymous
 */

 class outer{
    public void show()
    {
        System.out.println("Its an Outer class");
    }
    class Inner{
        public void show2()
        {
            System.out.println("It is an Inner class");
        }
    }
 }
public class NestedInnerClass {
    public static void main(String[] args) {
        
        outer obj = new outer();
        obj.show();

        outer.Inner obj2 = new outer().new Inner();
           obj2.show2();

    }
    
}

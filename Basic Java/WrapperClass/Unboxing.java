package WrapperClass;

/*
 * Unboxing ---> process of convertion of Wrapper class into the Corresponding primitive type
 * reverse process of Autoboxing
 * no need to use the intValue() Method
 */

public class Unboxing {

    public static void main(String[] args) {
        
        Integer i = new Integer(12);
        int a = i.intValue();
        int  j = a;
        System.out.println(i+ " " +a+ " " +j);
    }
    
}

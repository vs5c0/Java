package JavaInterfaces.LambdaExpresions;
/*
 * Lambda Expressions--> is a new feature in java
 * it is used to provide the implementation of functional interfaces
 * it reduce the code size
 */
@FunctionalInterface
interface An
{
    void print();
}
 class LambdaExpression {
    
    public static void main(String[] args) {
        
        An on = () ->
        {
            System.out.println("This is an Lambda Expression without parameters");
        };
        on.print();
    }
}

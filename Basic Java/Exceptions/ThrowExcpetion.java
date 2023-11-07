package Exceptions;
//throw --> used to throw the exceptions
//mainly used to throw the custom exceptions
 class ThrowExcpetion {
    public static void validate(int age){
        if (age<=18){
            throw new ArithmeticException("Person is not Eligible to vote");
        }
        else
        {
            System.out.println("Person is eligble to vote");
        }
    }
    public static void main(String[] args) {
        validate(19);
        System.out.println("Exception handling program using throw");
    }
    
}

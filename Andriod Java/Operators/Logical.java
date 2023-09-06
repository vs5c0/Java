package Operators;

 class Logical {
    public static void main(String[] args) {
        
        int a = 22;
        int b = 23;
        
        //AND Operator If two Expressions are True than result is True
        System.out.println((a>b)&&(a>b));

         //OR Operator If  at Least One Expression are True than result is True
        System.out.println((a>b) || (a>b));

         //NOT Operator If One Expression are True than result is False
        System.out.println(!(a==b));
    }
    
}

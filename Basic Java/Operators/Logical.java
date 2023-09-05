package Operators;

 class Logical {

    public static void main(String[] args) {
         int x = 10;
         int y = 20;
         int a = 4;
         int b = 5;
         //AND Operators Both  expressions are True Then Result is "True"
    System.out.println("AND Operators Applying on the Expressions");
         System.out.println((x>y)&&(a>b));
         System.out.println((x>y)&&(a<b));
         System.out.println((x<y)&&(a>b));
         System.out.println((x<y)&&(a<b));

        //OR Operators atleast  One Expression is True Then Result is "True"
    System.out.println("OR Operators Applying on the Expressions");
         System.out.println((x>y)||(a>b));
         System.out.println((x>y)||(a<b));
         System.out.println((x<y)||(a>b));
         System.out.println((x<y)||(a<b));  

         //Not Operators One Expression is Ture  Then Result is "False"
    System.out.println("Not Operators Applying on the Expressions");
         System.out.println(!(x>y)&&(a>b));
         System.out.println(!(x<y)&&(a>b)); 
         System.out.println(!(x>y));    
    }
    
}

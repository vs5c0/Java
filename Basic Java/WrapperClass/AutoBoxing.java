package WrapperClass;

/*
 * AutoBoxing---> process of automatic conversion of primitives into Corresponding wrapper Class
 * no need to use the ValueOF() Method
 */
 class AutoBoxing {

    public static void main(String[] args) {
        
    int a = 40;
     
    Integer i = Integer.valueOf(a);
    Integer j = i;

    System.out.println(a+ " " +i+ " "+j);
    }

    
}

package JavaInterfaces.Enumeration;
/*
 * Enumeration --> is a special data type which contains the set of predefined constants
 * It is named constants
 * improves the type safety
 * 
 */
enum Status{
        Running,Training,Pending,Success
    }
 class EnumExample {
    
    public static void main(String[] args)
     {
        Status E = Status.Running;
        System.out.println(E);
         System.out.println(E.ordinal());

    }
    
}

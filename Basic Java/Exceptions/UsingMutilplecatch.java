package Exceptions;
// A try block follows mutilple catch block is known as the mutiple catch exceptions

 class UsingMutilplecatch {
    public static void main(String[] args) {
        
        int i= 2;
        int j = 0;
        int an[] = new int[5];
        try{
            j = 18/i;
            System.out.println(an[1]);
            System.out.println(an[5]);
        }catch(ArithmeticException e){
            System.out.println("Cant divide by 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits");
        }
        catch(Exception e){
            System.out.println("Its an expample program using mutiple catch blocks");
        }
        System.out.println(j);
    }
    
}

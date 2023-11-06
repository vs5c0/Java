package JavaInterfaces.LambdaExpresions;

@FunctionalInterface
interface B{
    void run(int i);
}

 class LambdasingleParameters {
    public static void main(String[] args) {
        
        B oh =(int i) ->{

        
        System.out.println("This is single parameter lambda expressions : " +i);
        }; oh.run(5);
    } 
    
}  


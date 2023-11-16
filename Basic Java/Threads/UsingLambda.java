 package Threads;
 class UsingLambda {

    //Lamabda Expression used to short the code 
public static void main(String[] args) {
    
    Runnable ob1 = () ->
    {
        for(int i=0;i<5;i++){
            System.out.println("Threads");
        }
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    };


    Runnable ob2 = () ->
    {
        for(int i=0;i<5;i++){
            System.out.println("Exceptions");
        }
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    };

    Thread t1 = new Thread(ob1);
    Thread t2 = new Thread(ob2);
    t1.start();
    t2.start();
}

    
}

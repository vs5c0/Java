package Threads;
/*
 * thread is a  program than an execution created to perform task
 * thread have mainly 5 states
 * 1 New --> A new thread is created
 * 2 Runnable --> Execution of program
 * 3 Running --> Allocate to time slot
 * 4 Blocked --> to suspend ,wait,sleep
 * 5 Dead ---> Thread gone dead
 */
class Demo  extends Thread{
    public void run(){
        System.out.println("Thread");
        System.out.println("Thread in 1 ");
        for(int i = 1;i<=3;i++){
            System.out.println("i=" +i);
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread 1 is completed");
    }
    
    
}
class ThreadStates2 extends Thread{
     public void run(){
        System.out.println("Thread");
        System.out.println("Thread in 2 ");
        for(int i = 1;i<=3;i++){
            System.out.println("i=" +i);
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread 2 is completed");
    }
}
class ThreadStates
{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
       t2.start();
        try{
            Thread.sleep(1000);

        }catch(InterruptedException e ){
            e.printStackTrace();
        }
     
        System.out.println("Main Thread is completed");
        
    }
}
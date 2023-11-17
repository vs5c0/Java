package Threads;


/*
 * Race condition --> a type of bug occurs in the multithreading program
 * a condition having 2 or more threads to access the same resources and data at a time
 * we can avoid in 2 ways 
 * 1 Mutual Exclusion
 * 2 Synchorinze Process
 */
public class RaceCondition implements Runnable{
    private int c =0;
    public void increment(){
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        c++;
    }
    public int getValue()
    {
        return c;
    }
    public void run(){
        synchronized(this)
        {
            this.increment();
            System.out.println("Value of Thread increment: " +Thread.currentThread().getName() + " " +this.getValue());
        }
    }


    public static void main(String[] args) {
        RaceCondition cou = new RaceCondition();
            Thread t1 = new Thread(cou);
            t1.start();
        
        


}
}


package Threads;

public class UsingRunnables implements Runnable {
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("Threads");
        }
        try{
            Thread.sleep(12);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

 public static void main(String[] args) {
    Runnable obh = new UsingRunnables();
    Thread t3 = new Thread(obh);
    t3.start();
 }

    
}

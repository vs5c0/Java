package Threads;
/*
 * Thread --> thread in java is a light weight process used to reading the files,writing the files,processing the user input
 * Thread is execution of program
 * thread is created in 2 ways.They are
 * 1 . By extending the thread class
 * 2 . By using runnable interface
 */

 //Example Creating thread by using runnable interface
class Multi extends Thread{
    public void run(){
        System.out.println("Thread is Running with extending thread class");
    }
    public static void main(String[] args) {
        
        Multi m1 = new Multi();
        m1.start();
    }
}
package Threads;

// Creating using implements by using the Runnable interface

class implementinterface implements Runnable{

    public void run(){

        System.out.println("Thread is creating  by using the Implements of the Runnable interface");
    }

    public static void main(String[] args) {
        implementinterface mm = new implementinterface();
        Thread mu = new Thread(mm);
        mu.start();
    }
}
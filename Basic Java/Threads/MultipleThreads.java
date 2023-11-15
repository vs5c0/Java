package Threads;

 class A extends Thread {

    public void run(){
        System.out.println("Threads are running.....");
    }
    
}
class B extends Thread
{
    public void run()
    {
        System.out.println("It is a MultiThreading in java");
    }
}
class MultipleThreads {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }

}
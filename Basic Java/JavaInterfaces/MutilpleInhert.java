package JavaInterfaces;
// Mutiple inhertance in java by interfaces
// a class implements mutilple interfaces or a interfaces implements multiple interfaces 
// Java cant support the mutilple inhertance by interfaces can do it

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Ram implements Printable,Showable{
    public void print(){
        System.out.println("This is an print stmt");
    }
    public void show(){
        System.out.println("This is an Showable Stmt");
    }
}
 class MutilpleInhert {

    public static void main(String[] args) {
        Ram r = new Ram();
        r.print();
        r.show();
    }
    
}

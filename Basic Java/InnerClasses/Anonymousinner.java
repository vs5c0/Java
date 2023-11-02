package InnerClasses;

/*
 * Anonymous Inner class --> is an inner class without any name which can only create a single object
 * used in instance of object with certain extras like overloading and interfaces
 * created in 2 ways 1 Class 2 Interfaces
 */
abstract class Person{
    abstract void print();
}

 class Anonymousinner {
    public static void main(String[] args) {
        Person p = new Person() {
            void print(){
                System.out.println("It is an Anonoymous Inner class");
            }
        };
        p.print();
    }
    
}

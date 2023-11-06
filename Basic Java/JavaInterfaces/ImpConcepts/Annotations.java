package ImpConcepts;
/*
 * Annotations--> are used to represent the meta data
 * mainly used for classes, Methods, Functions,interfaces
 * Denoted as @ symbol
 * powerful tools used to maintainability,functionality,readability of a java code
 */

 class Animal{
    void eatsomething(){
        System.out.println("Eat Something");
    }
 }
 class Dog extends Animal
 {

    @Override
    void eatsomething() {
        System.out.println("Eat Something Dog");
    }
    
 }
 class Annotations {
    public static void main(String[] args) {
        Animal am = new Dog();
        am.eatsomething();
    }
    
}

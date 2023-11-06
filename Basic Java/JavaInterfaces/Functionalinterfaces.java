package JavaInterfaces;
/*
 * Functional interfaces--> type of interfaces having only one abstract method
 * it have no of any default ,static methods but having only one abstract method
 * also know as Single Abstract Method Interfaces
 */
@FunctionalInterface
interface A{
    void show();
}

 class Functionalinterfaces{
    public static void main(String[] args) {
        A obj = new A() {
            public void show()
            {
                System.out.println("It is an Functional Interfaces");
            }
        };
        obj.show();
        
    }
    
}

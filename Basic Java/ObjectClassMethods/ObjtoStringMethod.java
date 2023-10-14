package ObjectClassMethods;

 class ObjtoStringMethod {
 
    String name;
    int age;
    String college;
    String course;
    String Address;

             //CONSTRUCTOR
    ObjtoStringMethod(String name, int age, String college, String course, String Address)
    {
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.Address = Address;

    }
     

     //toString() Method  ----> used to representation of String in java
     // inbulit method in java
     //toString() Method is return the output as String format
    public String toString()
    {
            return name + " : " + age + " : " + college + " : " + course + " : " + Address;
    }

    public static void main(String[] args) {
         
        ObjtoStringMethod  b = new ObjtoStringMethod("Vikram", 21, "GATES", "CSE", "Anathapur"); 

        System.out.println(b.toString());
    }


}  


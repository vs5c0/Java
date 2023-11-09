package Exceptions;
// Throws --> used to declare the exception 
// it also provide the information to the caller of method about the exception
import java.io.*;
class M{
    void Method() throws Exception
    {
        System.out.println("Device is opearation");
    }

}
class Throws {
    public static void main(String[] args) throws Exception {
        M m = new M();
        m.Method();
        System.out.println("This is an Throws Example");
    }

    
}

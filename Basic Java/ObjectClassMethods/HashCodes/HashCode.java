package ObjectClassMethods.HashCodes;

import java.util.Scanner;

public class HashCode {

    public static void main(String[] args) {
        
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        Integer i = sc.nextInt();
        sc.close();
    // hash Code() method is used to represent the hashcode of a given object class
    // return an random unique values
    
        int hashValue = i.hashCode();
        System.out.println("Hash code of a Object :" +hashValue);

    }
    
}

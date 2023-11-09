package Exceptions.InputReaders;

import java.util.Scanner;

class UsingScanReader {
    public static void main(String[] args) {
        System.out.println("It is an Scanner Reader");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Your Number is:  " +num);
        
    }
    
}

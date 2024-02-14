package Exampless2;
import java.util.Scanner;
//Write a program that accepts an integer N as input and print N odd numbers from 1 in increasing order.
 class countofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;
        while(count<n){
            if(num%2==1){
                System.out.println("Odd Numbers: "+ num + " ");
                count++;
            }
        
           
         num++;
        }
sc.close();
    }
    
}

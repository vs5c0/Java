package Exampless2;

import java.util.Scanner;
//Write a program to find the sum S of all odd numbers from the given range(X,Y).
//Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings while reading the input or white
class sumofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter another  number: ");
        int y = sc.nextInt();

        int sum=0;
        for(int i=x;i<=y;i++){
            if(i%2==1){
                sum=sum+i;

            }
            
        }
        System.out.println(sum);
        sc.close();
    
    }
}

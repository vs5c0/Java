package ReverseNumbers;

import java.util.Scanner;

public class usingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Original number: "+num);

        int rever = 0;

        while(num!=0){
            rever=rever*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse Number:"+rever);
    }
    
}

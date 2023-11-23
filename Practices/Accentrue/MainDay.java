package Accentrue;

import java.util.Scanner;

class MainDay {

    int Calculate(int m,int n){
        int sum = 0;

        for(int i=m;i<=n;i++)
        if((i%3==0)&&(i%5==0))
        sum = sum+i;
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        MainDay obj = new MainDay();
        int result = obj.Calculate(m, n);
        System.out.println("Sum of the two numbers divisible by 3 and 5: " +result);
        
    }
    
}

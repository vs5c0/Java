package Practices;

import java.util.Scanner;


class  Main{
 

     private static void rev(int x){
        int r = 0;
        while(x>0){
        int by = x%10;
        r=(r*10)+by;
        x=x/10;

        }
 
        System.out.println("Reverse :" +r);
     }
    public static void main(String a[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number :");
     int n = sc.nextInt();
     System.out.println("Number :" +n);
     rev(n);
   
    }

    }

 


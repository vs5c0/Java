package Accentrue;

import java.util.Scanner;

/*
 * Write a program to display the sum of the numbers or sum of the table number
 */
public class SumofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Num = scan.nextInt();

        System.out.println("Multiply table of given " +Num+ ":");
        DisplayMultipytable(Num);

        int Sum = SumofNum(Num);
        System.out.println("Sum :" +Sum);
        scan.close();
    }
    private static void DisplayMultipytable(int Num)
    {
        for(int i = 1; i<=10;i++)
        {
            System.out.println(Num*i);
        }
    }

    private static int SumofNum(int Num){
        int Sum=0;
        for(int i=1;i<=10;i++){
            Sum = Sum +Num*i;
        }
        return Sum;
    }
}

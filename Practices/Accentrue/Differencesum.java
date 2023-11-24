package Accentrue;
import java.util.Scanner;

class Differencesum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value of N: ");
        int n = sc.nextInt();

         System.out.println("Enter a value of M: ");
        int m = sc.nextInt();

        System.out.println("Difference b/w the sum of divisible and not divisible of n and m: " +diffSum(m, n));
        sc.close();
    }
    public static int diffSum(int m, int n){
        int sum1 =0;
        int sum2 =0;
        for(int i=1;i<=m;i++){
            switch (i%n) {
                case 0:
                    sum1+=i;
                    break;
            
                default:
                sum2+=i;
                    break;
            }
        
        }
            return Math.abs(sum1 - sum2);
    }
}
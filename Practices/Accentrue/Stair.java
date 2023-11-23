package Accentrue;
import java.util.Scanner;
class Stair {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target stair: ");
        int n = sc.nextInt();
        System.out.println("Enter the max no of steps: " );
        int m = sc.nextInt();

        System.out.println("Total no of ways to reach the target stair: " +countWays(n, m));
    }

    static int countWays(int n,int m){

        int dp [] = new int[n+1];

        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=1;j<=m && j<=i; j++){
                dp[i]+=dp[i-j];
            }
        }

        return dp[n];
    }
}

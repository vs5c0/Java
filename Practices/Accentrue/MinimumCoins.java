package Accentrue;
import java.util.Scanner;
class MinimumCoins
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        int N = sc.nextInt();

        int five = (N - 4)/5;

        int one ;
        if ((N - 5*five)% 2==0) {
            one=2;
            
        }else{
            one =1;
        }

        int two = (N-5*five-one)/2;

        System.out.println(five +two +one + " " +five+ " " +two+ " " +one);
        sc.close();
    }
}
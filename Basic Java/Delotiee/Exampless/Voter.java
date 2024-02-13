package Exampless;
import java.util.Scanner;
class Voter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int n = sc.nextInt();

        if(n>=18){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
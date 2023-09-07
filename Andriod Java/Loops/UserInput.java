package Loops;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter Your Fav Number:");
        Scanner sc = new Scanner(System.in);
         int Answer = sc.nextInt();
         System.out.println("Your Number is :"+Answer);

         System.out.println("Enter Your Name:");
         String name = sc.next();
         System.out.println("Your Name is:" +name);
    }
    
}

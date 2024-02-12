package ReverseNumbers;
import java.util.Scanner;
public class usingbuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder(String.valueOf(num));
        StringBuilder reve = sb.reverse();
        System.out.println("Reversed Number: "+reve);
    }
    
}

package ReverseNumbers;
import java.util.Scanner;
public class usingbuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        sc.close();

        StringBuffer sb = new StringBuffer();
        sb.append(num);
        StringBuffer reve = sb.reverse();
        System.out.println("Reversed Number: "+reve);
    }
    
}

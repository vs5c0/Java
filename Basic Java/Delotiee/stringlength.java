package Exampless3;
import java.util.Scanner;
 class stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println("Enter another String: ");
        String ss = sc.next();

        if(s.length()==ss.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    
}

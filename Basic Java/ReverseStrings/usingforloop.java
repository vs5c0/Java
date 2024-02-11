package ReverseStrings;

import java.util.Scanner;

public class usingforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sv = sc.next();
        System.out.println("Given String:" +sv);
        String revs = "";

        for(int i =sv.length()-1;i>=0;i--){
            revs=revs+sv.charAt(i);
            System.out.println("Reverse String: "+revs);
            sc.close();
        }
    }
}

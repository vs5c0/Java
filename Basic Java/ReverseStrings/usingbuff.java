package ReverseStrings;

import java.util.Scanner;

public class usingbuff {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String :");
    String maha = sc.next();
   

    StringBuffer sb= new StringBuffer(maha);
    System.out.println(sb.reverse());
    sc.close();
}
    
}
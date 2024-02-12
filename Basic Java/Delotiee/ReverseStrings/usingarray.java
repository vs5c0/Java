package ReverseStrings;

import java.util.Scanner;

class usingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String br = sc.next();
        String reve = "";
        char ar[] = br.toCharArray();
        for(int i=br.length()-1;i>=0;i--){
            reve = reve+ar[i];
           
        }
        System.out.println("Reverse String:" +reve);
        sc.close();
    }
}

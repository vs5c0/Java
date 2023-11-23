 package Accentrue;
 import java.util.Scanner;
 class Day1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Word");
    String res = sc.nextLine();
    sc.close();
    System.out.println("Combination without Meaning");
    generateComb(res, "");

}
    private static void generateComb(String rem,String curr){
        if(rem.length()==0){
            System.out.println(curr);
        }else{
            for(int i=0;i<rem.length();i++){
                char pickchr = rem.charAt(i);
                String r = rem.substring(0, i) + rem.substring(i+1);
                generateComb(r, curr+pickchr);
                        }
        }
    }
}

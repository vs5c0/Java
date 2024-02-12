package ReverseStrings;
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sr = sc.nextLine();
        System.out.println("Original String: "+sr);
        System.out.println("Reverse String :" +reve(sr));
        sc.close(); 
    }
private static  String reve(String ss){
    StringBuilder sb = new StringBuilder();
    for(int i = ss.length()-1;i>=0;i--){
        sb.append(ss.charAt(i));
    }
    return sb.toString();

}
}
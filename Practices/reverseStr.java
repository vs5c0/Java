import java.util.Scanner;
class reverseStr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String: ");
        String sss = sc.nextLine();
        System.out.println("Reverse String: " +reve(sss));
        sc.close();
    }

    private static String reve(String ss)
    {
        StringBuilder sb  = new StringBuilder();

        for(int i = ss.length()-1;i>=0;i--){
            sb.append(ss.charAt(i));
        }
        return sb.toString();
    }
}
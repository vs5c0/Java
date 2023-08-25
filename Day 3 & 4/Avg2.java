import java.util.Scanner;
class Avg2 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  1 Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2 Number:");
        int n2 = sc.nextInt();
        System.out.println("Enter the 3 rd Number:");
        int n3 = sc.nextInt();

        int sum = n1+n2+n3;
        int avg = sum/3;
        System.out.println("Avg:" +avg);
    }
}

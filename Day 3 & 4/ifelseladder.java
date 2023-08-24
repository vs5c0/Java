import java.util.*;
class ifelseladder
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Condition:");

        int n = scan.nextInt();
        if(n==1)
        {
            System.out.println("Your number is 1:");
        }
        else if(n==2)
        {
            System.out.println("Your number is 2");

        }
        else if(n==3)
        {
            System.out.println("Your number is 3");

        }
        else
        {
            System.out.println("null");

        }
    }
}

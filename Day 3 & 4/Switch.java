import java.util.Scanner;
class Switch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Values Between 1-5");
        int num = sc.nextInt();
        switch (num) {
            case 1:
            System.out.println("Your Number : 1");
            break;
            case 2:
            System.out.println("Your Number : 2");
            break;
            case 3:
            System.out.println("Your Number : 3");
            break;
            case 4:
            System.out.println("Your Number : 4");
            break;
            case 5:
            System.out.println("Your Number : 5");
            break;
        
            default:
          
            System.out.println("Your Number is not in 1-5");
           
                break;
        }

    }
    
}

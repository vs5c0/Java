import java.util.Scanner;
class Demo2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the Two Numbers For Addition:");
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            {

            System.out.println("Addition:"+c);
            }
            c = a-b;
            {

            System.out.println("Sub:"+c);
            }
             c = a*b;
            {

            System.out.println("Mul:"+c);
            }
            c = a/b;
            {

            System.out.println("Div:"+c);
            }

            
        }
    }  
    }

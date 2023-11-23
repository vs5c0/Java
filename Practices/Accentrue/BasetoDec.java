package Accentrue;
import java.util.Scanner;


 class BasetoDec {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number with base 17: " );
        String Base17 = sc.next();

        System.out.println(Decimal(Base17));
    }
    static int Decimal (String Base17){
        int decimalValue=0;
        int power = 0;
        for(int i=Base17.length()-1;i>=0;i--){
        char digit = Base17.charAt(i);

        int digitvalue;
        switch (digit) {
            case '0':
            digitvalue = 0;
                break;
                case '1':
            digitvalue = 1;
            break;
            case '2':
            digitvalue = 2;
                break;
                case '3':
            digitvalue = 3;
                break;
                case '4':
            digitvalue = 4;
                break;
                case '5':
            digitvalue = 5;
                break;
                case '6':
            digitvalue = 6;
                break;
                case '7':
            digitvalue = 7;
                break;
                case '8':
            digitvalue = 8;

                break;
        
            default:
            digitvalue = digit-'A'+10;
                break;
        }

        decimalValue+=digitvalue*Math.pow(17, power);
        power++;


    }
    return decimalValue;
}
}

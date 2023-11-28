 package Accentrue;

//  The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

// int OperationsBinaryString(char* str);

// The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation
// You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

// Note:

// No order of priorities of operations is required
// Length of str is odd
// If str is NULL or None (in case of Python), return -1
// Input:
// str: 1C0C1C1A0B1

// Output:
// 1

// Explanation:
// The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.

import java.util.Scanner;
 class BinaryOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with Binary Digits: ");
        String str = sc.nextLine();

        System.out.println("Result of Given String with Binary digits:" +OperationBinary(str));
        sc.close();
    }

    public static int OperationBinary(String str)
    {
        if(str=="Null")
        return -1;

        int ret = str.charAt(0) - '0';

        for(int i =1;i<str.length();){

        
        char oper = str.charAt(i);
         i++;

         switch (oper) {
            case 'A':
            ret = ret & str.charAt(i) - '0';
             break;
             case 'B':
            ret = ret  | str.charAt(i) - '0';
             break;
             case 'C':
            ret = ret ^ str.charAt(i) - '0';
             break;
         
            default:
            return -1;
                
         }
          i++;
        }
        return ret;
    }
    
}

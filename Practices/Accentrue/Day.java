package Accentrue;

import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = sc.nextLine();
        sc.close();
        int re = findLargestNumberWithoutNine(word);
        System.out.println("Result: " +re);

    }
    private static int findLargestNumberWithoutNine(String word){
        String[] nums = word.split("\\D+");
        int largestNumber = -1;

        for(String numString :nums){
            if(!numString.isEmpty() && !numString.contains("9")){
                int Number = Integer.parseInt(numString);
                largestNumber = Math.max(largestNumber, Number);

            }
            
        }
        
return largestNumber;

    }

    
}

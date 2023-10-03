package Practices;

import java.util.Scanner;

class Palindrome{
   
    //Palindrome a Number

        public static void square(int n){
            for(int i=1;i<n;i++){
                
                    System.out.println("\t****");
                
            }
        }
        private static void sqaureprint (int n){
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                    System.out.println("\t*");
                }
                System.out.println("\n");
            }
        }
         public static void main(String[] args) {
        
        System.out.println("\n\t This is an Triangle ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        sqaureprint(n);
        System.out.println("\n\t Perfect Square ");
         }
    }


package Accentrue;
import java.util.Scanner;

class video{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rating: ");
        int rate = sc.nextInt();

        if(rate>=81 && rate<=100){
            System.out.println("Outstanding");
        }else if(rate>=61 && rate<=80){
            System.out.println("Excellent");
        }else if(rate>=51 && rate<=60){
            System.out.println("Good");
        }else{
            System.out.println("Average");
        }
    }
}
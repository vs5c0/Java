package Exampless;
import java.util.Scanner;
 class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int m = sc.nextInt();
        
        int []arr = new int[m];
        System.out.println("Enter the Array elements:");
        //the loop is used to store the elements in the array arr[i]
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        //this  if stmt used to do operations 
        for(int i=0;i<m;i++){
            if(arr[i]%2==0){
            sum=sum+arr[i];
            }
        }
        System.out.println("Sum of even numbers:" +sum);

        sc.close();
        
    }
    
}

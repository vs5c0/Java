
import java.util.Random;
import java.util.Scanner;



 class Game {
    public static void main(String[] args) {
        
        System.out.println("Hello Welcome to Magic World");
        System.out.println("What is Your Name?");
         System.out.println("Please Enter Your Name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
  
        System.out.println("Hello...... " +name+ " Welcome to the Magic World?");
        System.out.println("Shall We Start the game?");
        System.out.println("Please Select the Following Options..." +name);
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = sc.nextInt();

        while(beginAnswer !=1 )
        {
        System.out.println("Shall We Start the game?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        beginAnswer = sc.nextInt();

        }

        Random random = new Random();
        int x = random.nextInt( 10) + 1;
        System.out.println("Please Guess the Number :");
        int userinput = sc.nextInt();

        int TimesTired = 0;
        boolean hasWon = false;
        boolean hasFinish = false;

        while(!hasFinish)
        {
            TimesTired++;
           if(TimesTired < 7){
            if(userinput == x)
            {
                hasWon=true;
                hasFinish=true;
            }else if( userinput > x){
                System.out.println("Guessing Number is Higher Comapre to me ");
                userinput = sc.nextInt();
        } else{
              System.out.println("Guessing Number is Smaller compare to me ");
                userinput = sc.nextInt();
        }
    } else{
        hasFinish = true;
    }
}
        if(hasWon){
            System.out.println("Congraulations.!  Your Number is Guess at " +TimesTired+  " Trail");
        }
        else{
            System.out.println("Game Over....!");
            System.out.println("The Number is :" +x);
        }
 
    
    
    
}
 }
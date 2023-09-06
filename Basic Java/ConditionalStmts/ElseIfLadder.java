package ConditionalStmts;

class ElseIfLadder {
    public static void main(String[] args) {
         int marks = 70;

         if (marks <=35)
         {
            System.out.println("Fail");
         } 
         else if(marks==45)
         {
            System.out.println("C Grade");
         }
         else if(marks==60)
         {
            System.out.println("B Grade");
         }
         else if(marks==70)
         {
            System.out.println("A Grade");
         }
         else if(marks==75)
         {
            System.out.println("Super S Grade");
         }
         else {
            System.out.println("Invalid");
         }
    }
    
}

package Loops;

 class NestedWhile {

    public static void main(String[] args) {
        
        int i=0;
        while(i<=4)
        {
            System.out.println("Hello ,What is Your Name? " +i);
            int j=1;
            while(j<=4)
            {
            System.out.println("My Name is Ganesh " +j);
            j++;
            }
            i++;
        }
        System.out.println("Ok That's Good" +i);
    }
    
}

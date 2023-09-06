package ConditionalStmts;

 class Nestedif {

    public static void main(String[] args) {
        int age =18;
        int height = 170;

        if(age >= 18 )
        {
            System.out.println("Age is Eligible");

            if (height>=170)
            {
                System.out.println("Height is Eligible");
               
            }
            else{
                System.out.println("His is age is not Eligible for Army");
            }
        }
        else {
            System.out.println("His Height is Not Eligble for Army");
        }
    
    }
    
}

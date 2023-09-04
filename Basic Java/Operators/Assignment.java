package Operators;

 class Assignment {
    public static void main(String[] args) {
        int a = 12;
        int b;
         b = a;
         System.out.println("Var Using = a:" +b);

         b += a;
         System.out.println("Var Using = +a:" +b);

         b -= a;
         System.out.println("Var Using = -a:" +b);

         b *= a;
         System.out.println("Var Using *= a:" +b);

         b /= a;
         System.out.println("Var Using /= a:" +b);

         b = b-a;
         System.out.println(b);

    }
    
}

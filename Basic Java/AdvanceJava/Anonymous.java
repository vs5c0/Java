package AdvanceJava;

class Anonymous {

    int a;
    int b;
    int c;
    int d;

    public Anonymous(int x, int y)
    {
        a=x;
        b=y;
        int ab = x+y;
        System.out.println("Addition of two numbers : " +ab);
    }
    
    public void Sub(int m,int n)
    {
         c=m;
         d=n;
         int cd=m-n;
         System.out.println("Sub of Two Number :" +cd);

   } 

   public static void main(String[] args) {
    
    new Anonymous(12,2).Sub(12,10); //Anonoymous Object --> dont have any Name
     new Anonymous(10,12).Sub(100,10);
   }
}

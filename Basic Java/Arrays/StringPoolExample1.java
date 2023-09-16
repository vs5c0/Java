package Arrays;

 class StringPoolExample1 {
    public static void main(String[] args) {
        
        String s1= "Java";
        String s2= "Python";

        String s3 = new String("C");
         String s4 = new String("Java");
          String s5 = new String("Data Science");
           String s7 = new String("DSA");
            String s8 = new String("Python");
            if(s1==s8){
                System.out.println("Its True");
            }
            else{
                System.out.println("Its not True");
            }

            System.out.println((s2==s8) + " It is True");
            System.out.println((s4==s5));

    }
    
}

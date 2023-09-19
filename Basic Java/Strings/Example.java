package Strings;

 class Example {

    public static void main(String[] args) {
        
        // Creating a String in One Way with out New Key Word

        String s1 = "Venkat Sai";
        System.out.println("Your Name is : " +s1);

        String name = new String("Venky");
        System.out.println("Your Name is : "+name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(2));

    }
    
}

package Strings.StrandMethods;

public class StrMethod5 {
    public static void main(String[] args) {
        
        //length() Method --> used to find theb length of the given String

        String s ="New String";
        System.out.println(s.length());
        

        //Intern() Method --> Used to to insert the String object to Pool. if One String has a Value and Other String have a Same Value then it Dsiplays only Once.


        String s1 = new String("RamaCchandra");
        String s2 = s1.intern();
        System.out.println(s1);
        System.out.println(s2);

    }
    
}

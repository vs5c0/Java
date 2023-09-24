package Strings.StrandMethods;

 class StringBuffering {

    
    /*  
     String Buffer is an Peer Class of String Provides Functionality of Strings
     --Represents Growable and Writable Character Sequence 
     --It is Synchorized Multiple threads are can't be Call the Methods.
      
    */
    public static void main(String[] args) {
        
        StringBuffer Buff = new StringBuffer("Hello");
        Buff.append(" World!.Im Java.");
        System.out.println(Buff);

    }
    
}

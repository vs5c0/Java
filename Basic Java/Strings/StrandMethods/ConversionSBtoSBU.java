package Strings.StrandMethods;

 class ConversionSBtoSBU {
    public static void main(String[] args) {

        /*
         * Conversion of String Buffer to String Builder can't be Directly possible.
         * First we convert into String Object in Inbuilt Method String() after to can Convert it
         */
        
        StringBuffer sbl = new StringBuffer("Hello Bharat....");

        String str = sbl.toString();

        StringBuilder stl = new StringBuilder(str);
        System.out.println(stl);
    }
    
}

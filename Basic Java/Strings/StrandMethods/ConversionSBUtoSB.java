package Strings.StrandMethods;

 class ConversionSBUtoSB {
    public static void main(String[] args) {

        /*
         * Conversion of String Builder to String Buffer can't be Directly possible.
         * First we convert into String Object in Inbuilt Method String() after to can Convert it
         */
        
        StringBuilder sbl = new StringBuilder("Hello Bharat....");

        String str = sbl.toString();

        StringBuffer stl = new StringBuffer(str);
        System.out.println(stl);
    }
    
}


package Collection;

import java.util.LinkedHashSet;
import java.util.Set;
 class setexample {

    public static void main(String[] args) {
        /*
         * Set --> cant allow the duplicates
         * it have only the unique values
         */

         Set<String> hu = new LinkedHashSet()<String>();
          
            hu.add("Java");
            hu.add("Script");
            hu.add("Java");

            System.out.println(hu);
         
    }
    
}

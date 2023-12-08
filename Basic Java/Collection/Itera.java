package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Itera {

    /*
     * Iterator --> used to loop through collections
     */
    
     public static void main(String[] args) {
        
        ArrayList<String> num = new ArrayList<String>();
        {
            num.add("Mango");
            num.add("Apple");
            num.add("Potatoes");

            Iterator<E> itr  = num.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
                
            }
        }
     }
}

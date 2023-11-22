package CollectionAPIs;
/*
 * Map is used to store,update,remove the elements based on the key
 * Map contain unique values
 * Map is a collection key value pair
 * 
 */

import java.util.HashMap;
import java.util.Map;

class Maps {

    public static void main(String[] args) {
        
        Map<String,Integer> st = new HashMap<>();
        st.put("Vinay", 21);
        st.put("Venu", 32);

        System.out.println(st.get("Vinay"));
    }
    
}

package CollectionAPIs;

import java.util.ArrayList;
import java.util.Iterator;

class usinglterator {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Pine Apple");
        list.add("Apple");

        //we can use the iterator the arrage the elements in  order

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    
}
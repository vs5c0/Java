package CollectionAPIs;

/*
 * Array List --> used to store the elements
 * it is like an array
 * we can add and remove the elements
 * more flexiable than traditional array
 * we can also store the duplicate data
 * arraylist--> extends -->Abstractlist-->implements-->list-->extends-->collection-->extends-->iterable
 */
import java.util.ArrayList;

class ArraylistExample {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Pine Apple");
        list.add("Apple");

        System.out.println("Array list Example :" + list);
    }
    
}

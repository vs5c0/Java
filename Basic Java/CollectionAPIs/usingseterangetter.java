package CollectionAPIs;

import java.util.ArrayList;

/*
 * setter --> used to change the element or set the elements
 * getter --> used to return the element with the specific index
 */
class usingseterangetter {
    public static void main(String[] args) {
        
        ArrayList<String> lt = new ArrayList<String>();
        lt.add("Mangoes");
        lt.add("Apples");
        lt.add("Kivi");

        System.out.println("List of the Friuts using the getter: " +lt.get(1));

        lt.set(2, "Dates");

        for(String friuts:lt){
            System.out.println(friuts);
        }

        }

}

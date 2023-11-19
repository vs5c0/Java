package CollectionAPIs;
import java.util.ArrayList;
 class usingforloop {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("String");
        list.add("Mango");
        list.add("Video");

        for(String friut :list){
            System.out.println(friut);
        }
        }
    
}

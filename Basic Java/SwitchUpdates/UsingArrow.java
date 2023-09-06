package SwitchUpdates;

 class UsingArrow {
    public static void main(String[] args) {
        
        String day = "Monday";
        switch(day){
        case "Sunday", "Saturday" -> System.out.println("6am");

        case "Monday" -> System.out.println("Early in Mrg 4am");

        default  -> System.out.println("Early Mrg 7am");

    }
    
}
 }

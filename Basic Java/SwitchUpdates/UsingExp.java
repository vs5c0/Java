package SwitchUpdates;

 class UsingExp {
    public static void main(String[] args) {
        
        String day = "Monday";
        String result = "";

        result = switch(day)
        {
            case "Sunday", "Saturday" -> "6am";

            case "Monday" -> "4am";

            default ->"7am";

        };
        System.out.println(result);
        
    }
    
}

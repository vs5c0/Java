package SwitchUpdates;

 class UsingYield {
    public static void main(String[] args) {
        
        String day = "Monday";
        String result = "";

        result = switch(day)
        {
            case "Sunday", "Saturday" :yield "6am";

            case "Monday" :yield "4am";

            default : yield "7am";

        };
        System.out.println(result);
        
    }
    
    }


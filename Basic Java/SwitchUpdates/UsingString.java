 
 package SwitchUpdates;
 class UsingString {
    public static void main(String[] args) {
        String day = "Monday";

        switch(day)
        {
            case "Sunday", "Saturday" :
            System.out.println("Early Morning 6 am");
            break;

            case "Monday":
            System.out.println("Early Morning 4 am");
            break;

            default:
            System.out.println("Early Morning 7am ");

        }
    }
    
}

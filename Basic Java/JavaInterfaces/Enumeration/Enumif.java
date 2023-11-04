package JavaInterfaces.Enumeration;

enum days{
    sunday,monday,tuesday
}
class Enumif
{
    public static void main(String[] args) {
        
        days dd = days.monday;
        if(dd==days.sunday)
        {
            System.out.println("This is an Sunday");
        } else if(dd == days.monday)
        {
            System.out.println("This is a Monday");
        }
        else if(dd == days.tuesday)
        {
            System.out.println("This is a Tuesday");
        }
        else
        {
            System.out.println("This is not present in the enum days");
        }
 
    }
}
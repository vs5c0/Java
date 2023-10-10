package AdvanceJava.AccessModifers;

class Main
{
    private String name;
  
    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name= newName;
    }

}

// private Access Modifers --> Decalartions visible only within class
public class PrivateAM {
    public static void main(String[] args) {
        
        Main  ob = new Main();
        ob.setName("Ram");
     System.out.println("Name: "+ob.getName());
    }

    
}

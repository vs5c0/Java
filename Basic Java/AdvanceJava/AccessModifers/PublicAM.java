package AdvanceJava.AccessModifers;

class Main
{
    public String name;

    public void String()
    {
        System.out.println("This is Public ");
    }
}

// public Access Modifers --> Decalartions are visible everyone
public class PublicAM {
    public static void main(String[] args) {
        
        Main ob = new Main();
        ob.name = "Rama";
        ob.String();
    }
}

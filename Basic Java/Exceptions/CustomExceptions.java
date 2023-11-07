package Exceptions;


//Custom exceptions--> used to create own exceptions by user want
class RamExcpetion extends Exception
{
    public RamExcpetion(String str)
    {
    super(str);
    }
}

 class CustomExceptions 
 {
    static void validate(int age) throws RamExcpetion
    {
        if(age<=18)
        {
            throw new RamExcpetion("Not a Major person");
        }
        else
        {
            System.out.println("Major person");
        }
    }
    public static void main(String[] args) {
        try
        {
            validate(19);
        }
        catch(RamExcpetion e)
        {
            System.out.println("It is a catch Exception: " +e);
        }    
        System.out.println("It is custom Exceptions java program");
    }

    
}

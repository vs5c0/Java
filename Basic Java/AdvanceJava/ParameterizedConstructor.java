package AdvanceJava;

public class ParameterizedConstructor {

    private String name;
    private int id;

    public ParameterizedConstructor(String name, int id)
    {
        this.name = name;
        this.id=id;
    }

    public static void main(String[] args) {
        
        ParameterizedConstructor obj = new ParameterizedConstructor("Rama", 21);
        System.out.println("Name : " +obj.name+ " id : " +obj.id);
    }
    
}

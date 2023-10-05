
package AdvanceJava;

class Main
{
    private int Age;
    private String Name;

    public int getAge()
    {
        return Age;
    }

    public String getName()
    {
        return Name;
    }
    public void  setAge(int Age){
        this.Age = Age;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }

}
 class This{
     
    public static void main(String[] args) {
        
        Main obj = new Main();
        obj.setAge(21);
        obj.setName("Adithya");

        System.out.println("Name : " +obj.getName()+ "   Age : " +obj.getAge());
    }
}
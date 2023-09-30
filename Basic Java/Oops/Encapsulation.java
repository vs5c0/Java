package Oops;

class Main
{
    private String Name;
    private String Id;
    private int age;

  public String getName() 
  {
            return Name;
  }
   public String getId() 
  {
            return Id;
  }
   public int getage() 
  {
            return age;
  }


  public void setName(String newName){
    Name = newName;
  }
   public void setId(String newId){
    Id = newId;
  }
   public void setage(int newAge){
    age = newAge;
  }

/*
 * Encapsulation --> is a process of Wrapping the code and data 
 * also called Data Hiding
 * to Achieve the Encapsulation
 * --> Declare the Variables by using private
 * --> setter and Getter is methods are used to modify and view the data
 * --> Varibles and Methods plays an important role
 */
   
}


class Encapsulation{
    public static void main(String[] args) {
        
        Main obj = new Main();
        obj.setName("Vikram Adithya");
        obj.setId("Sw1");
        obj.setage(21);

        System.out.println("Name: " +obj.getName()+ " Age : " +obj.getage()+  " Id: " +obj.getId());
    }
}
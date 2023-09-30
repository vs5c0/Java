package Oops;

 class GetSet {
 

    public static void main(String[] args) {
        
        Main obj = new Main();
        obj.setName("Vikram");
        obj.setage(21);

        System.out.println(" Name :" +obj.getName()+ " Age :" +obj.getage());
    }
}

    
class Main {

    private String name;
    private int age;

    public String getName(){
        return name;
    }
     

    public int getage(){
        return age;
    }
       public void setName(String newName){
         name = newName;  
    }
    public void setage(int newAge){
        age=newAge;
    }
    
}

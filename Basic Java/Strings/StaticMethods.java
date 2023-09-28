package Strings;

 class StaticMethods{
    
     String name;
    int price;
    static String brand;

    public void show(){
        System.out.println(brand + ":" +price+ ":" + name);

    }


    
    public static void show1(StaticMethods obj){
        System.out.println(obj.brand + ":" +obj.price+ ":" + obj.name);

    }
}
class Stat{
    public static void main(String[] args) {
        
    StaticMethods obj1 = new StaticMethods();
        obj1.name="Apple";
        obj1.price = 150000;
      


     StaticMethods obj2 = new StaticMethods();
       obj2.name="Apple";
       obj2.price = 132000;
      
          StaticMethods.brand = "SamartPhone";

        obj1.show();
        obj2.show();

        StaticMethods.show1(obj1);
    }
}


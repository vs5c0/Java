package Strings;

 class StaticVarible {
    
     static String name;
    int price;
     static String brand;

    public void show(){
        System.out.println(brand + ":" +price+ ":" + name);

    }
}
class Stat{
    public static void main(String[] args) {
        
        StaticVarible obj1 = new StaticVarible();
          obj1.price = 150000;
      


           StaticVarible obj2 = new StaticVarible();
       
        obj2.price = 132000;
      

        StaticVarible.brand = "Phone";
          StaticVarible.name = "Vivo";

        obj1.show();
        obj2.show();
    }
}


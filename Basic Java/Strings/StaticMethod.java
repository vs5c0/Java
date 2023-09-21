package Strings;

 class StaticMethod {

 


     String name;
     int price;
      static String brand;

     public void show(){

        System.out.println(name +":"+ price +":"+ brand);
     }
     public  static void show1(StaticMethod s1){

        System.out.println(s1.name +":"+ s1.price +":"+ brand);
     }
    public static void main(String[] args) {

    
    
    StaticMethod s1 = new StaticMethod();
    s1.name="Phone";
    s1.price=400000;
    StaticMethod.brand="One Plus"; 

    StaticMethod s2 = new StaticMethod();
    s2.name="Phone";
    s2.price=1000000;
    StaticMethod.brand="Poco"; 

  StaticMethod.brand = "SmartPhone";

    StaticMethod.show1(s1);
  

  
    s1.show();
    s2.show();


    }
    
}

    


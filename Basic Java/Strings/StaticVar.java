package Strings;

 class StaticVar {


     String name;
     int price;
     String brand;

     public void show(){

        System.out.println(name +":"+ price +":"+ brand);
     }
    public static void main(String[] args) {

    StaticVar s = new StaticVar();
    s.name="Phone";
    s.price=1234555;
    s.brand="Apple"; 
    
    StaticVar s1 = new StaticVar();
    s1.name="Phone";
    s1.price=400000;
    s1.brand="One Plus"; 

    StaticVar s2 = new StaticVar();
    s2.name="Phone";
    s2.price=1000000;
    s2.brand="Poco"; 

    s.show();
    s1.show();
    s2.show();


    }
    
}

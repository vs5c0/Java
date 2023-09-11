package Oops.Oops2;

 class Bird  extends Animal{
    private int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings){
        super(name, color, legs, hasTale);
        this.wings = wings;

    }
    public void eat (String food){
        System.out.println("chewing" + food);

    }

    public void fly(){
        System.out.println(this.getName() + "is Flying");
    }

    public int getWings(){
        return wings;
    }
    
}

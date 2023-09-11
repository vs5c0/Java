package Oops.Oops2;

 class Animal {

    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    public Animal (String name, String color, int legs, boolean hasTale){
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;

    }

    public void eat (String food){
        System.out.println("eating " +food);
    }
    public String getName(){
        return name;

    }
    
}

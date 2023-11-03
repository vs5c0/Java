package JavaInterfaces;
/*
 * Interface --> is an blue print of class
 * it has static constants and abstract methods
 * it is mainly used to achieve the abstraction and mutilple inheritances 
 * we use interface as a keyword for acces the interfaces in java
 */

interface Drawable{
    void draw();
}
class square implements Drawable
{
    public void draw(){
        System.out.println("this is an Square");
    }
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("this is an circle ");
    }
}

class interfacesExample  {
    public static void main(String[] args) {
        
        Drawable d = new Circle();
        Drawable s = new square();
        d.draw();
        s.draw();
    }

    
}

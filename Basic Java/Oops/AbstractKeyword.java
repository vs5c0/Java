package Oops;
/*
 * Abstract keyword --> it is a non -access Modifier used to achive the abstract class and methods
 * it is used to Achieve the abstract one of the pillar of OOPS
 * 
 */

 abstract class Toyto
 {
    abstract void BMW();
 }
 class Benz extends Toyto
 {
   void BMW()
   {
    System.out.println("Abstract Keyword : Honda is Good Bike");
   }
 }
class AbstractKeyword {
    public static void main(String[] args) {
        Benz obj = new Benz();
        obj.BMW();
    }

    
}

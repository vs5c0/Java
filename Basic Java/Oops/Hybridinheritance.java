package Oops;

class Solar
{

}
class earth extends Solar
{

}
class Mars extends Solar
{

}
//Hybrid inheritance --> combinations of two or more inhertances
 class Hybridinheritance  extends earth {
    public static void main(String[] args) {
        
        Solar s = new Solar();
        earth e = new earth();
        Mars m = new Mars();
        System.out.println(s instanceof Solar);
    }
    
}

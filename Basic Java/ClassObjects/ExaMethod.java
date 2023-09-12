package ClassObjects;

 class Cal {

    public void PlayMusic(){

        System.out.println("Music is Playing....");
    }
    public String getMeAPen(int cost){

        if(cost >= 10)
        {
            return "Pen";

        }
        else{
            return "Nothing";
        }

     

    }
    
}
class ExaMethod
{
    public static void main(String[] args) {
        
        Cal c = new Cal();
        c.PlayMusic();
         String str = c.getMeAPen(12);
         System.out.println(str);
    }
}

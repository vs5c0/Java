package Oops;

 public class Phones {

   private String name;
    int memorysize;
      int screensize;
    int camera;
     int price;

     public void PlayMusic (String TrackName){
        System.out.println("Playing" +TrackName);
     }

     public void setname(String name){
        this.name = name;

     }
    public String getname(){
        return this.name;
    }
}

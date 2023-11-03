package JavaInterfaces.Enumeration;

enum Seasons{
    Winter,Summer,Spring,Rainy
}
 class forloopEnum {
    public static void main(String[] args) {
        
        
        for (Seasons s : Seasons.values())
        {
            System.out.println(s);
        }
    }
    
}

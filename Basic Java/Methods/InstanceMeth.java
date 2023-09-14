package Methods;

 class InstanceMeth {
    public static void main(String[] args) {
         InstanceMeth obj = new InstanceMeth();
         System.out.println("Sum :" +obj.add(12,12));
    }
    
    int s;
    public int add(int a ,int b){
        s= a+b;
        return s;
        
    }
}

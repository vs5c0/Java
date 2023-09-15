package Methods;

 class StackHeap {
    int num = 8;
    public int add(int a , int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        
        StackHeap se = new StackHeap();
        StackHeap se1 = new StackHeap();
        
         int r1 = se1.add(12, 12);
        System.out.println(r1);
        System.out.println(se1.num);
    }
}

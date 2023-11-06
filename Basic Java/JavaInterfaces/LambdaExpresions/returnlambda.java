package JavaInterfaces.LambdaExpresions;

@FunctionalInterface
interface H{
    int add(int i, int j, int k);
}
 class returnlambda {
    public static void main(String[] args) {
        
        H oi = (i,j,k)-> 
        {
            return i+j+k;
        };
        int res = oi.add(23, 13, 123);
        System.out.println("Lambda Expression with reutrn: " +res);
    }
    
}

package Arrays;
class Anonymous{
    // Anonymous array is an array without any name
    //Java Supports This array 
    // We can Created it once and Use it.


    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        
        printArray(new int[] {123,1231,231,12,421});
    }


}
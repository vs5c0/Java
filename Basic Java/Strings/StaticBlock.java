package Strings;
class StaticBlock {

    static int val;
    int val_1 = 23;
    static{
        val = 1; 
        System.out.println("This is an Static block");
    }
}
    class Main{
        public static void main(String[] args) {
            
            System.out.println(StaticBlock.val);
        }
    }
    


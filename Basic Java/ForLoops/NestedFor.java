package Loops.ForLoops;

 class NestedFor {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=4;i++)
        {
            int j;
            for(j=1;j<=4;j++){
                System.out.println("Summer:" +j );
            }
            System.out.println("Winter :" +i );
        }
    }
    
}

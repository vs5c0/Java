package JavaInterfaces.LambdaExpresions;
@FunctionalInterface
interface V{
    void draw(int x,int y);
}

 class LambdaMultipleparameters {
    public static void main(String[] args) {
        V oj = (int x, int y)->
        System.out.println("This is an multiple lambda expression : " +x +y);
        oj.draw(12, 2);
    }
    
}

package ClassObjects;

class Calculator
{
    int a;
     public int add(int n1, int n2){
        int r = n1 + n2;
        return r;

     }
}

class Classes 
{
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;

        Calculator  cal = new Calculator();

        int result = cal.add(num1, num2);

        System.out.println(result);
    }
}
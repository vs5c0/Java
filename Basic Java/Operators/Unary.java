package Operators;

class Unary
{
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        System.out.println("Post Increment: a" +(a++));
        System.out.println("Pre Increment:" +(++a));
        System.out.println("Post Decrement: a" +(a--));
        System.out.println("Pre Decrement:" +(--a));

        System.out.println("Post Increment: b" +(b++));
        System.out.println("Pre Increment:" +(++b));
        System.out.println("Post Decrement: b" +(b--));
        System.out.println("Pre Decrement:" +(--b));

        System.out.println(a++);
        System.out.println(++a);
    }



}
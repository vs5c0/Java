package TypeConversion;
 class Explicit {
    public static void main(String[] args) {
        //Explicit Type casting is a process of convert the high data type into low datatype

        double d = 23.45;
        float fa = (float)d;

        float a1 = 23.55f;
        long l = (long)a1;


        System.out.println("Before Conversion:" +d);
        System.out.println("After Conversion:" +fa);

        System.out.println("Before Conversion:" +a1);
        System.out.println("After Conversion:" +l);

    }
}

class TypeCastingExp
{
    public static void main(String [] args)
    {
        double gravity = 9.8f;
        byte grav =  (byte)gravity;
        System.out.println("Gravity :" +gravity);
        System.out.println("Gravity:" +grav);
    }
}
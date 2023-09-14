package Methods;

 class MethodOverloading {
   
        
        public  int add(int a, int b)
        {
            return a+b;
        }

         public  int mul(int a, int b,int c, int d)
        {
            return a*b*c*d;
        }

         public  double sub(int a, int b, double c)
        {
            return a-b-c;
        }

        public static void main(String[] args) {
            MethodOverloading obj = new MethodOverloading();

            System.out.println(obj.add(12, 11));
             System.out.println(obj.mul(12, 11,12,41));
              System.out.println(obj.sub(12, 11,34.0));
                }
    }
    
    

package Methods;

class Arguments{
     
    public int add(int a, int b){
        return a+b;

    }

    public int sub (int a, int b, int c){
        return a-b-c;
    }

   
        public static void main(String[] args) {
             Arguments c = new Arguments();
             System.out.println(c.add(12, 12));
        }
    }



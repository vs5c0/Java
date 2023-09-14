package Methods;

class Datatypes{
     
    public int add(int a, int b){
        return a+b;

    }

    public double sub (int a, int b, double c){
        return a-b-c;
    }
// Changing datatypes in method
   
        public static void main(String[] args) {
             Datatypes c = new Datatypes();
             System.out.println(c.sub(12, 12, 32.0));
        }
    }



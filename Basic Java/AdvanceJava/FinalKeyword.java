package AdvanceJava;


//final keyword ---> is a non-access modifier one we can store the values it can't be change.
//it is used to 
//>>> Create constants 
//>>> prevent method Overridings
//>>> prevent inheritance
class Vectors
{
    final void run()
    {
        System.out.println("This is an Final Keyword");
    }
}
class pulser extends Vectors
{
    
}


class FinalKeyword {
    public static void main(String[] args) {
        pulser ob = new pulser();
        ob.run();
    }
    
}

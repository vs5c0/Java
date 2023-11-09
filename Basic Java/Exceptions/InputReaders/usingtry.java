package Exceptions.InputReaders;
import java.io.BufferedReader;
//we can also close the files by using try
import java.io.IOException;
import java.io.InputStreamReader;
 class usingtry {
    public static void main(String[] args) throws Exception{
        int number = 0;
        try(BufferedReader ba = new BufferedReader(new InputStreamReader(System.in)))
        {
            number = Integer.parseInt(ba.readLine());
            System.out.println(number);
        }
        
    }
    
}

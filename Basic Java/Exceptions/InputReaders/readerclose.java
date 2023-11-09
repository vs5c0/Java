package Exceptions.InputReaders;
// we can open the reader files for our need we can also close the files
//we can close the files by using close()

import java.io.BufferedReader;
import java.io.InputStreamReader;

//By Using try and finally keywords we can close it
 class readerclose {
    public static void main(String[] args) throws Exception {
        int a = 8;
        try {
            InputStreamReader ur = new InputStreamReader(System.in);
            BufferedReader bi = new BufferedReader(ur);
            a = Integer.parseInt(bi.readLine());
            System.out.println(a);
            
        }finally{
        
                System.out.println("this is an example of Try Resources utilization");
               

        }
    }
}

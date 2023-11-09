package Exceptions.InputReaders;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Buffered Reader--> used to read the data form the input
 * it can read the dat by using readLine()
 * it makes the performace fast
 *
 */
class Bufferreader {  
    
    public static void main(String[] args) throws Exception {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter a Number: ");
        String name = br.readLine();
        System.out.println("Welcome to the Bharat: " +name);
    }
}

package Exceptions;
/*
 * Exception--> is an unwanted event occurs during the execution of a program
 * Main reasons are:
 * --Device errors
 * --Invalid user input
 * --code errors
 * Error --> irrecoverable conditions
 */

class UsingtryandCatch {

    public static void main(String[] args) {

       
        try
        { 
           //try --> is a keyword used to specify the block of code
           int a  = 100/0;
        } catch(Exception e)
        { 
            //Catch--> used to handle the exceptions

            System.out.println("Exception program using try and catch :"   + e);
        }
    }
    
}

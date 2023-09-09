package Arrays;

import java.util.Scanner;

class SimpleGame {
    public static void main(String[] args) {
        
        String EmployeeName [] = { "Ram","Sita","Vikram","Pavan","Raju","Shoba","Kavya","Viksa"};
        int age [] ={ 23,24,22,34,51,20,23,21};
        int ContactNumber [] ={939384293,342777442,632113132,42535235,251111224,241214142,12132411,532252352};
        String jobRole [] ={"Software Developer","Tester","Cheif Executive Offer "," Employees Director"," Electric Manager","SoftwareTester","Java Developer","Python Programmer"};

        for(int i=0;i<EmployeeName.length;i++){
            System.out.println(EmployeeName[i]);
        }

        System.out.println("Please Enter Employee Name :");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Employee Name is :" +name);
        for(int i=0;i<EmployeeName.length;i++){
            if(name.equals(EmployeeName[i]))
            {
                System.out.println("Employee age is: " +age[i]);
                System.out.println("Employee Contact Number is: " +ContactNumber[i]);
                System.out.println("Employee Job Role is: " +jobRole[i]);
            }
        }


      
    
        } 

            }
        

    
    


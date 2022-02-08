package Assignment;
import java.util.Scanner;



public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   
    	 System.out.println("Enter a number to check whether it's a palindrome number or not: ");
    	 int num=sc.nextInt();
    	 int remainder=1;
    	 int palindrome=0;
    	 int quotient=num;
    	 while(quotient>0) {
    		 remainder=quotient%10;
    		 palindrome=palindrome*10+remainder;
    		 quotient=quotient/10;
    	 }
    	 
    	 if(palindrome == num) {
    		 System.out.println("It's a Palindrome Number");
    		 
    	 }
    	 else {
    		 System.out.println("It's not a Palindrome Number!");
    	 }
    	 System.out.println("\n");
      }

 

            //function to printPattern

       public void printPattern() {
    	   
    	   System.out.println("Enter a number to print a pattern:");
    	   int limit=sc.nextInt();
    	   for (int i=limit;i>0;i--)
    	   {
    		   for(int j=0;j<i;j++) {
    			   System.out.print("*");
    		   }
    		   System.out.println();
    	   }
    	   System.out.println("\n");

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.println("Enter a number to check if it's a prime number or not:");
     	   	int num=sc.nextInt();
     	   	for (int i =2;i<=num;i++)
     	   	{
     	   		if (i==num) {
     	   		System.out.println("It's a Prime Number");
     	   		}
     	   		else if(num%i==0) {
     	   			System.out.println("It's not a Prime Number");
     	   			break;
     	   		}
     	   		else {
     	   			continue;
     	   		}
     	   	}
     	   System.out.println("\n");
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           System.out.println("Enter a number to print fibonacci series till nth term:");
           int num=sc.nextInt();
           System.out.println("Fibonacci Series Till "+num+" numbers are: ");
           System.out.print(first+",");
           System.out.print(second);
           	for (int i =2;i<num;i++)
    	   	{
    	   		int third = first+second;
    	   		first=second;
    	   		second=third;
    	   		System.out.print(","+third);
    	   	}
           	System.out.println("\n");

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
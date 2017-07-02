/*Write a program TestDemo.java, which accepts the number as argument and print “You

Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.

It should print “You Have Entered Positive Value” if the value is greater than 0 along with

the ASCII value.

It should print “You Have Entered Negative Value” if the value is less than 0 along with the

ASCII value.

• A student has A grade if marks are more than 70, B grade if marks are between 61 and 70

and C grade if marks are less than 61 ) Write a program to print the grade for

the given marks.

• Take three subjects like PCM and calculate the average and the above grading system will

work on the average.

• Take marks of the subject from the user.

*/

//Package declaration 
package com.acadgild.assignment4;

//import:Scanner class 
import java.util.Scanner;

//Class declaration
public class TestDemo {
	
	//Main method 
	public static void main(String[] args) {
		
		//First part which accepts the number as argument and print the desired result 
		int x;
			System.out.print("Enter number: ");
			Scanner in = new Scanner(System.in);
			x= in.nextInt();
	            	      
	      if (x==0)
	    	 System.out.println("You Have Entered Zero: "+x);
	      else if (x>0)
	    		 System.out.println("You Have Entered Positive Value: "+x);
	      else if (x<0)
	    		 System.out.println("You Have Entered Negative Value: "+x);
	      		 System.out.println("");
	      			      		
	    // To Calculate Grade of Student
	      		 
		int p,c,m;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
		
        System.out.println("Enter Marks Obtained in PCM Subjects ");
        System.out.println("");
        System.out.print("Enter Physics Marks: ");
        p = scan.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        c = scan1.nextInt();
        System.out.print("Enter Maths Marks: ");
        m = scan2.nextInt();
                  
            sum = sum + p+c+m;
            avg = sum/3;
		
        System.out.print("Your Grade is:  ");
        if(avg>70)
        {
            System.out.print("A");
        }
        else if(avg>61 && avg<=70)
        {
            System.out.print("B");
        }
        else if(avg<=61)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("No Grade");
        }
	      
	}

}

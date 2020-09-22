
package classes;

import java.lang.*;
import classes.*;
import interfaces.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
import fileio.*;
import java.util.Scanner;
public class Start {
    public static void main(String args[])
{ int xtry =1;
    do{try{
     Scanner input = new Scanner(System.in);
        System.out.println("     AMERICAN INTERNATIONAL UNIVERSITY-BANGLADESH");
        
        Date date=new Date();
        DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String curDate=dateFormate.format(date);
        System.out.println("               Date:"+curDate);
        
        LocalTime time=LocalTime.now();
        Date d=new Date();
        String s="hh:mm a";
        SimpleDateFormat sdf=new SimpleDateFormat(s);
        System.out.println("               Time:"+sdf.format(d));
  Scanner sc = new Scanner(System.in);
  University u=new University();
  FileReadWriteDemo frwd = new FileReadWriteDemo();
  boolean choice = true;
 // int x,y,z,i;
	while(choice)
	{       System.out.println("________________________________");
                System.out.println("");
		System.out.println("1. Faculty Management ");
		System.out.println("2. Student Management");
		System.out.println("3. Course Transactions");
		System.out.println("4. Exit ");
                System.out.println("________________________________");
                System.out.print("Enter your number :");
	    int	x=sc.nextInt();
                
           
		switch(x)
		{
			case 1:
			System.out.println("1.  Insert New Faculty 2.  Remove Existing Faculty 3.  Show All Faculty  4. Going Back ");
                        System.out.print("Choice your option >> "); 
			int y=sc.nextInt();
                        
                switch (y) {
                    case 1:
                        System.out.println("---------------------");
                        System.out.println("Insert New Faculty");
                        System.out.println("---------------------");
                        System.out.println("Insert New Faculty");
                        System.out.print("Enter Faculty ID: ");
                        String Id1 = sc.next();
                        System.out.print("Enter Faculty Name: ");
                        String name1 = sc.next();
                        System.out.print("Enter Faculty Salary: ");
                        double salary = sc.nextDouble();
                        Faculty e1 = new Faculty();
                        e1.setFId(Id1);
                        e1.setName(name1);
                        e1.setSalary(salary);
                        u.insertFaculty(e1);
                        break;
                    case 2:
                        System.out.println("---------------------");
                        System.out.println("Remove Existing Faculty");
                        System.out.print("Enter Faculty ID: ");
                        String Id3 = sc.next();
                        Faculty e3 = u.getFaculty(Id3);
                        u.removeFaculty(e3);
                        break;
                    case 3:
                        System.out.println("Show All Faculty");
                        u.showAllFaculty();
                        break;
                    case 4:
                        System.out.println("---------------------");
                        System.out.println("Go Back");
                        System.out.println("---------------------");
                        break;
                    default:
                        System.out.println("---------------------");
                        System.out.println("Invaild Choice");
                        System.out.println("---------------------");
                        break;
                }
			break;
			case 2:
			System.out.println("1.  Insert New Student 2. Remove Existing Student 3. Show All Student 4 Going Back");
                        System.out.print("Choice your option >> "); 
		  int z=sc.nextInt();
                switch (z) {
                    case 1:
                         System.out.println("---------------------");
                        System.out.println("Insert New Student");
                        System.out.print("Enter Student  id: ");
                        int id1 = sc.nextInt();
                        System.out.print("Enter Student Name: ");
                        String name1 = sc.next();
                        Student s1 = new Student();
                        s1.setSid(id1);
                        s1.setName(name1);
                        u.insertStudent(s1);
                        break;
                    case 2:
                         System.out.println("---------------------");
                        System.out.println("Remove Existing Student");
                        System.out.print("Enter Student ID: ");
                        int id3 = sc.nextInt();
                        Student s2 = u.getStudent(id3);
                        u.removeStudent(s2);
                        break;
                    case 3:
                        System.out.println("---------------------");
                        System.out.println("Show All Student");
                        u.showAllStudents();
                        break;
                    case 4:
                        
                        System.out.println("---------------------");
                        System.out.println("Go Back");
                        System.out.println("---------------------");
                        break;
                    default:
                        System.out.println("---------------------");
                        System.out.println("Invaild Choice");
                        System.out.println("---------------------");
                        break;
                }
			break;
			case 3:
			System.out.println("1.  Adding Course 2. Withdraw Course 3. Going Back");
                        System.out.print("Choice your option >> "); 
			int i=sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("---------------------");
                        System.out.println("Adding Course");
                        System.out.print("Enter Student ID: ");
                        int id1 = sc.nextInt();
                        System.out.print("Enter Course Number: ");
                        int an1 = sc.nextInt();
                        System.out.print("Enter Credit: ");
                        int credit1 = sc.nextInt();
                        if(credit1>3)
                        {
                            u.getStudent(id1).getCourse(an1).adding(credit1);
                            
                            
                            
                            
                            frwd.writeInFile("Credit	: $"+ credit1+" in "+ an1);
                        }
                        break;
                    case 2:
                        System.out.println("---------------------");
                        System.out.println("Withdraw ");
                        System.out.print("Enter Student ID: ");
                        int id2 = sc.nextInt();
                        System.out.print("Enter Crouse Number: ");
                        int an2 = sc.nextInt();
                        System.out.print("Enter Withdraw Credit: ");
                        int credit2 = sc.nextInt();
                        if(credit2>3 && credit2 <= u.getStudent(id2).getCourse(an2).getCredit())
                        {
                            u.getStudent(id2).getCourse(an2).dropping(credit2);
                            
                            
                            
                            frwd.writeInFile("Withdraw	: $"+ credit2+" from "+ an2);
                        }
                        break;
                    case 3:
                        System.out.println("---------------------");
                        System.out.println("Going Back..");
                        System.out.println("---------------------");
                        break;
                    default:
                        System.out.println("---------------------");
                        System.out.println("Invalid Option");
                        System.out.println("---------------------");
                        break;
                }
			break;
			case 4:
			System.out.println("********************");
			System.out.println("Exit");
			choice = false;
			System.out.println("********************");
		    break;
			default:
				
			System.out.println("********************");
			System.out.println("Invalid Option");
			System.out.println("********************");
			break;
					
			
			
			
		}
	}
       xtry=2; 
}

  catch (java.util.InputMismatchException err) {
            System.out.println("\nINVALID INPUT!");
        } }
while(xtry==1);
} 
}

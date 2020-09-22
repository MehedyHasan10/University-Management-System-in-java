
package classes;
import java.lang.*;
import interfaces.*;
public class University implements StudentOperations, FacultyOperations
{
	private Student students[] = new Student[500];
	private Faculty faculties[] = new Faculty[100];
	
	public void insertStudent(Student s)
	{
		int f=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==null)
			{
				students[i]=s;
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Student Inserted");
		}
		else
		{
			System.out.println("Student can not be inserted");
		}
	}
	public void removeStudent(Student s)
	{
		int f=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==s)
			{
				students[i]=null;
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Student Removed ");
		}
		else
		{
			System.out.println("Student can not be removed");
		}
	}
	public Student getStudent(int sid)
	{
		Student s= null;
		for(int i=0; i<students.length; i++)
		{
			if(students[i]!=null)
			{
				if(students[i].getSid()==sid)
				{
					s=students[i];
					break;
					
				}
			}
		}
		return s;
		
		
	}
	public void showAllStudents()
	{
		for(Student s: students)
		{
			if(s!=null)
			{ 
				System.out.println("*************");
				System.out.println("Student name: "+s.getName());
				System.out.println("Student ID  :"+s.getSid());
				System.out.println("*************");
				s.showAllCourse();
				System.out.println();
				System.out.println();
			}
		}
	}
	public void insertFaculty(Faculty e)
	{
		int f=0;
		for(int i=0; i<faculties.length; i++)
		{
			if(faculties[i] == null)
			{
				faculties[i] = e;
				f = 1;
				break;
			}
		}
		if(f == 1)
		{
			System.out.println("Faculty Inserted");
		}
		else
		{
			System.out.println("Faculty can Not be Inserted");
		}
		
	}
	public void removeFaculty(Faculty e)
	{
		int f = 0;
		for(int i=0; i<faculties.length; i++)
		{
			if(faculties[i] == e)
			{
				faculties[i] = null;
				f = 1;
				break;
			}
		}
		if(f == 1)
		{
			System.out.println("Faculty Removed");
		}
		else
		{
			System.out.println("Faculty can Not be Removed");
		}
	}
	public void showAllFaculty()
	{
		System.out.println("--------------------------------");
		for(Faculty e : faculties)
		{
			if(e!= null)
			{
				System.out.println("Faculty Name: "+ e.getName());
				System.out.println("Faculty Id  : "+ e.getFId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
				System.out.println();
			}
		}
	}
	public Faculty getFaculty(String fid)
	{
		Faculty e = null;
		
		for(int i=0; i<faculties.length; i++)
		{
			if(faculties[i] != null)
			{
				if(faculties[i].getFId().equals(fid))
				{
					e = faculties[i];
					
					break;
				}
			}
		}
		return e ;
	
	}
	
}
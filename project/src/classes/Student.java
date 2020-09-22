
package classes;
import java.lang.*;
import interfaces.*;
public class Student implements CourseOperations 
{
	private String name;
	private int sid;
    private Course courses[]=new Course[10];
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public String getName( )
	{
		return name;
	}
	public int getSid( )
	{
		return sid;
	}
        @Override
	public void insertCourse(Course c)
	{
		int f = 0;
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] == null)
			{
				courses[i] = c;
				f = 1;
				break;
			}
		}
		if(f == 1)
		{
			System.out.println("Course Inserted");
		}
		else
		{
			System.out.println("Course can Not Insert");
		}
	}
    public void removeCourse(Course c)
	{
		int f = 0;
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] == c)
			{
				courses[i] = null;
				f = 1;
				break;
			}
		}
		if(f == 1)
		{
			System.out.println("Course Removed");
		}
		else
		{
			System.out.println("Course can Not Remove");
		}
	}
	public void showAllCourse()
	{
		for(Course c : courses)
		{
			if(c != null)
			{
				c.showInfo();
			}
		}
	}
	public Course getCourse(int CourseNumber)
	{
		Course c = null;
		
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] != null)
			{
				if(courses[i].getCourseNumber() == CourseNumber)
				{
					c = courses[i];
					break;
				}
			}
		}
		return c;
	}

    public void setSid(String id1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

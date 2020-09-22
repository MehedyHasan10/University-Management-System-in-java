
package classes;
import java.lang.*;
import interfaces.*;
public abstract class Course implements CourseTransections
{
	protected int courseNumber;
	protected int credit;
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber=courseNumber;
		
	}
	public void setCredit(int credit)
	{
		this.credit=credit;
	}
	
public int getCourseNumber( )
{
	return courseNumber;
	
}
public int getCredit( )
{
	return credit;
}
public abstract void showInfo( );
{
	//System.out.println("courseNumber:"+courseNumber);
	//System.out.println("credit:"+credit);
}
public void adding(int quantity)
{
	if(quantity>0)
	{
		System.out.println("previous credit: "+credit);
		System.out.println("Total credit: "+quantity);
		credit+=quantity;
		credit=credit+quantity;
		System.out.println("present credit: "+credit);
		
	}
	else 
	{
		System.out.println("Can not add credit");
	}
}
public void dropping(int quantity)
{
	if (quantity>0 && quantity<=credit)
	{
		System.out.println("Previous credit: "+credit);
		System.out.println("Dropped credit: "+quantity);
		credit-=quantity;
		credit=credit-quantity;
		System.out.println("Present credit: "+credit);
	}
	else
	{
		System.out.println("can not drop");
	}
}


}
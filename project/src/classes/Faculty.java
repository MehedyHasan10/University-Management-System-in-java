
package classes;
import java.lang.*;
public class Faculty extends Person
{
	private String name;
        private String fid;
        private double salary ;
	
        public Faculty(){
            
        }
        public Faculty(String name,String fid,double salary) {
           this.name=name;
           this.fid=fid;
           this.salary=salary;
            
        }

         public void setSalary(double salary)
	{
		this.salary=salary;
	}
        public double getSalary( ) 
	{
		return salary;
	}
	
}
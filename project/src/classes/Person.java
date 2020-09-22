   
package classes;

import java.lang.*;
public class Person {
    private String name;
    private String fid;
    
    public Person(){
        
    }
    public Person(String name,String fid){
        this.name=name;
        this.fid=fid;
        
    }
    
   
   public void setName(String name)
	{
		this.name=name;
	}
	public void setFId (String fid) 
	{
		this.fid=fid;
	}
	
	public String getName( ) 
	{
		return name;
	}
	public String getFId( )
	{
		return fid;
        }
}

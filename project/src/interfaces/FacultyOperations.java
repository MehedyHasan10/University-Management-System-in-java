
package interfaces;
import classes.Faculty;
public interface FacultyOperations
{
	void insertFaculty(Faculty e);
	void removeFaculty(Faculty e);
	Faculty getFaculty(String fid);
	void showAllFaculty();
}


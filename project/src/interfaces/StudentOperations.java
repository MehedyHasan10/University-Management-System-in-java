package interfaces;
import classes.*;
public interface StudentOperations
{
	void insertStudent(Student s);
	void removeStudent(Student s);
	Student getStudent(int sid);
	void showAllStudents();
}

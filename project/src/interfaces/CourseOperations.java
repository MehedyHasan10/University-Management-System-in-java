package interfaces;
import java.lang.*;
import classes.*;

public interface CourseOperations
{
   void insertCourse(Course c);
   void removeCourse(Course c);
   Course getCourse(int CourseNumber);
   void showAllCourse();
}
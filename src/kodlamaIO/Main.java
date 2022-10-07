package kodlamaIO;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.InstructorManager;
import kodlamaIO.core.DatabasLogger;
import kodlamaIO.core.FileLogger;
import kodlamaIO.core.Logger;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.HibernateInstructorDao;
import kodlamaIO.dataAccess.JdbcCategoryDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabasLogger(),new FileLogger()};
		Instructor instructor = new Instructor(1, "Dries", "Mertens");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		System.out.println("****************************************************");
		
		Category category = new Category(4, "HTML");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);

		System.out.println("****************************************************");
		
		Course course = new Course(1, 2, 1, "Mertens ile A'dan Z'ye C#", 50);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
	}

}

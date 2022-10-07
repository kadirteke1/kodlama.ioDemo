package kodlamaIO.business;

import kodlamaIO.core.Logger;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if (course.getUnitPrice()<0) {
			
			throw new Exception("Kurs fiyati 0'dan küçük olamaz!");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}

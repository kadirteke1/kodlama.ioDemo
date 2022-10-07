package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs eklendi. Kurs adý : "+course.getCourseName());
	}

}

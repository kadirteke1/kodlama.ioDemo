package kodlamaIO.entities;

public class Course {
	private int id;
	private int categoryId;
	private int instructorId;
	private String courseName;
	private double unitPrice;

	public Course(int id, int categoryId, int instructorId, String courseName, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.instructorId = instructorId;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}

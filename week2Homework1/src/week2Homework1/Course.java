package week2Homework1;

public class Course {
	private int id;
	private String courseName;
	private String teacher;
	
	public Course() {
		System.out.println("Ýþlem bitti");
	}

	public Course(int id, String courseName, String teacher) {
		this();
		this.id = id;
		this.courseName = courseName;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	
	
}

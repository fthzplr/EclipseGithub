package week3Homework2;

public class Main {

	public static void main(String[] args) {
		
		Instructure instructure = new Instructure();
		InstructorManager instructorManager = new InstructorManager();
		
		instructure.setFirstName("Engin");
		instructure.setDetail("Founder Kodlama io");
		instructorManager.doBroadcast(instructure);
		
		
		Student student = new Student();
		StudentManager studentManager = new StudentManager();
		
		student.setFirstName("Fatih");
		student.setDetail("Participant Kodlama io");
		studentManager.joinBroadcast(student);
		
	}

}

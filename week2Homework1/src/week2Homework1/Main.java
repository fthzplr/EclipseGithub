package week2Homework1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1 , " Programlamaya Giri�in Temelleri "," Engin Demiro�" );
		Course course2 = new Course(2 , " Java React"," Mehmet K�seo�lu" );
		Course course3 = new Course(3 , " C#"," Fatih Zoplar" );

		/*Course course3 = new Course();
		course3.setId (3);
		course3.setCourseName("C# Temelleri");
		course3.setTeacher ("Fatih Zoplar");
		*/
		
		Course[] courses = {
				course1, course2, course3
		};
		
		for (Course course : courses ) {
			System.out.println (course.getId()+course.getCourseName()+course.getTeacher());
		
		}
		
		

	
	}

}

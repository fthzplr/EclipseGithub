package week3Homework2;

public class InstructorManager extends UserManager{
	
	public void doBroadcast(User user) {
		System.out.println(user.firstName + " adl� e�itmen yay�n� ba�latt�");
		System.out.println(user.detail);
	}
}
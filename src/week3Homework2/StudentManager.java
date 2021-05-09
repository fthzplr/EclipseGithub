package week3Homework2;

public class StudentManager extends UserManager{
	
	public void joinBroadcast(User user) {
		System.out.println(user.firstName + " adlı katılımıcı yayına katıldı");
		System.out.println(user.detail);
	}

}

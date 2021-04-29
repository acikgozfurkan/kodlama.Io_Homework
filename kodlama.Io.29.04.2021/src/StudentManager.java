
public class StudentManager {
	public void add(User user) {
		System.out.println(user.userName+" Öğrenci eklendi" + " * " + user.userNumber);
	}
	
	public void Delete(User user) {
		System.out.println(user.userName+" Öğrenci silindi" + " ! " + user.userNumber);
	}
	
}

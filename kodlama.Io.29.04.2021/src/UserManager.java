

public class UserManager {
	public void addUser(User user) {
		System.out.println("Kullan�c� ba�ar� ile eklendi."+user.userName);
	}
	public void Delete(User user) {
		System.out.println("kullan�c� silindi."+user.userName);
	}
	
	// bulk insert
	public void addMultiple(Student[] students) {
		for(Student student : students) {
		addUser(student);
		}
	}
	
}

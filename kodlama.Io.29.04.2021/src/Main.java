
public class Main {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.id=1205;
		student1.userName="ahmet bilge";
		student1.userNumber="123456";
		student1.studentEmail="ahmet@gmail.com";
		
		Student student2 = new Student();
		student2.id=131;
		student2.userName="burak tek";
		student2.userNumber="654578";
		
		Instructor instructor1 =  new Instructor();
		instructor1.userName="Engin Demiroğ";
		instructor1.userNumber="500001";
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		
		

		
		

	}

}

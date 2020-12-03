package AbstractClassesAndObjects;

public class CloneableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneableCourse course1 = new CloneableCourse
				("Cloned course", new String[] {"Ivan", "Eva", "Maria"},3);
		CloneableCourse course2 = new CloneableCourse
				("Some Other Course", new String[] {"Georgy", "Maria", "Nikolai", "Stefan"},4);
		
		course2 = course1;
		System.out.println(course2 == course1);
		
		try {
			course2 = (CloneableCourse) course1.clone();
			System.out.println(course2 == course1);
			course2.print();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Cloning failed. This object can't be cloned");
		}
		
	}
}

package AbstractClassesAndObjects;

import OOP.Course_16_2;

class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course_16_2 someCourse = new Course_16_2("Course name with ArrayList");
		
		someCourse.addStudent("Ivan");
		someCourse.addStudent("Mira");
		someCourse.addStudent("Gergana");
		someCourse.addStudent("Stoyan");
		someCourse.addStudent("Stanislav");
		
		someCourse.print();
	
		someCourse.dropStudent("Gergana");
		someCourse.print();
		
		someCourse.dropStudent("Stoyan");
		someCourse.dropStudent("Aleksandra");
		someCourse.dropStudent("Mira");
		someCourse.print();
	}

}

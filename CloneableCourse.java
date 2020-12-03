package AbstractClassesAndObjects;

public class CloneableCourse implements  Cloneable{

//	Проучете интерфейса Clonable
//	и концепцията за deep copy.
//	Пренапишете класа Course, така
//	че да имплементира интерфейса Clonable.
//	Внимавайте да извършите дълбоко копиране
//	- deep copy, на полето за ученици.

		private String courseName;
		private String students[];
		private int numberOfStudents;
		
		CloneableCourse(){
			this.courseName = "";
			students = null;
			numberOfStudents = 0;
		}
		
		public CloneableCourse(String courseName,String students[],int numberOfStudents ){
			this.courseName = courseName;
			this.students = students;
			this.numberOfStudents = numberOfStudents;
		}
	
		@Override
		public Object clone () throws CloneNotSupportedException{
			return super.clone();
		}

		public String getCourseName() {
			return courseName;
		}
		
		public void addStudent(String student) {
			if(numberOfStudents < 100) {
				students[numberOfStudents] = student;
				numberOfStudents++;
			}
		}
		
		public void dropStudent(String student) {
			for(int i = 0; i < numberOfStudents; i++) {
				if(student.equals(students[i])) {
					for(int j = i; j <  numberOfStudents - 1; j++) {
						students[j] = students [j+1];
					}
					numberOfStudents--;
					students[numberOfStudents] = null;
					break;
				}
			}
		}
		
		public String[] getStudents() {
			return students;
		}
		
		public int getNumberOfStudents() {
			return numberOfStudents;
		}
		
		public void print() {
			System.out.println(this.getNumberOfStudents() + " students in total in "+ this.getCourseName());
			
			for(int i = 0; i < this.getNumberOfStudents(); i++) {
				System.out.println("students [" + i + "] is " + this.getStudents()[i]);
			}
		}

}

/**
 * To test the class Student in its entirety by calling all methods and
 * constructors and then printing the results
 * @author Nathan Anneken
 *@version 1.0
 */

public class StudentTester 
{
	public static void main(String [] args)
	{
		String studentName;
		studentName = "Nathan Anneken";
		Student student1 = new Student(studentName);
		System.out.println("Creating a new student with no exams yet: ");
		System.out.println(student1.toString());
		System.out.println("Student Letter grade should return 'I'");
		System.out.println("Letter Grade: "+student1.getLetterGrade());
		System.out.println("Adding an exam grade of 89");
		student1.addExamGrade(89);
		System.out.println(student1.toString());
		System.out.println("Name: "+student1.getName());
		System.out.println("Exams taken: "+student1.getExamCount());
		System.out.println("Numeric grade: "+student1.getAverage());
		System.out.println("Letter grade: "+student1.getLetterGrade());
		System.out.println("Creating new student with exam total of 155 and a total of 2 exams:");
		Student student2 = new Student("Anna Williams", 2, 155.0);
		System.out.println(student2.toString());
		System.out.println("Adding an exam grade of 64");
		student2.addExamGrade(64);
		System.out.println(student2.toString());
		System.out.println("Name: "+student2.getName());
		System.out.println("Exams taken: "+student2.getExamCount());
		System.out.println("Numeric grade: "+student2.getAverage());
		System.out.println("Letter grade: "+student2.getLetterGrade());
		
	} //end main
} //end StudentTester

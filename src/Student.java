/**
 * This class creates a student file and stores their Name, Number of Exams,
 * and the average of all those exams, and is able to return all values
 * to the calling method in a String
 * @author Nathan Anneken
 * @version 1.0
 */
public class Student 
{
	private String Name;
	private int Exams;
	private double scoreTotal;
	
	/**
	 * This constructor initializes Exam number and score total to 0 while
	 * creating a student file for a student given their name
	 * @param studentName The name of the new Student
	 */
	
	public Student(String studentName)
	{
		Name = studentName;
		Exams = 0;
		scoreTotal = 0.0;
	} //end Student
	
	/**
	 * This constructor initializes the Exam number and score total to a
	 * given, supplied pair of values while also creating a new student file
	 * given the students name
	 * @param studentName Name of the Student
	 * @param numberOfExams The number of exams taken previously
	 * @param examPoints The addition of all points scored on previous exams
	 */
	
	public Student(String studentName, int numberOfExams, double examPoints)
	{
		Name = studentName;
		Exams = numberOfExams;
		scoreTotal = examPoints;
	} //end Student
	
	/**
	 * Adds a given exam grade to a students file
	 * @param examScore The final score on the exam
	 */
	
	public void addExamGrade(double examScore)
	{
		Exams++;
		scoreTotal = scoreTotal + examScore;
	} //end addExamGrade
	
	/**
	 * Finds the number of Exams previously taken by a student
	 * @return Number of Exams
	 */
	
	public int getExamCount()
	{
		return Exams;
	} //end getExamCount
	
	/**
	 * Finds the average of all previous exams taken 
	 * @return The average of all previous exams or 0.0 if none where taken
	 */
	
	public double getAverage()
	{
		if(Exams>=1)
			return (scoreTotal/Exams);
		else
			return 0.0;
	} //end getAverage
	
	/**
	 * Finds the letter grade given a students average score
	 * @return A char letter grade for a student
	 */
	
	public char getLetterGrade()
	{
		if (getAverage()>=90.0)
			return 'A';
		if (getAverage()>=80.0)
			return 'B';
		if(getAverage()>=70.0)
			return 'C';
		if(getAverage()>=60.0)
			return 'D';
		if(getAverage()>0.0)
			return 'F';
		else
			return 'I';
	} //end getLetterGrade
	
	/** 
	 * Finds a given student's name
	 * @return the Student's name
	 */
	
	public String getName()
	{
		return Name;
	} //end getName
	
	/**
	 * Splices together a students Name, number of exams taken, letter grade, and the 
	 * average for the taken exams into one string
	 * @return A string representation of a students name, number of exams, average,
	 * and their letter grade given their average
	 */
	
	public String toString()
	{
		String studentData;
		if(Exams==0)
			studentData = Name+", "+Exams+" exams, no grade yet";
		else if(Exams==1)
			studentData = Name+", "+Exams+" exam, "+getAverage()+" "+getLetterGrade();
		else
			studentData =  Name+", "+Exams+" exams, "+getAverage()+" "+getLetterGrade();
		return studentData;
	} //end toString
} //end Student

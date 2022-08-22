
import java.time.LocalDate;

public class Student implements Comparable <Student>
{

	private int studentID;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	
	public Student(String firstName, String lastName, int studentID, LocalDate dateOfBirth)
	{
		
		this.firstName=firstName;	
		this.lastName=lastName;
		this.studentID=studentID;
		this.dateOfBirth=dateOfBirth;

	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getStudentID()
	{
		return studentID;
	}
	
	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	//**************
	
	public String setFirstName(String S)
	{
		return firstName;
	}
	
	public String setLastName(String S)
	{
		return lastName;
	}
	
	public LocalDate setDateOfBirth(LocalDate d)
	{
		return dateOfBirth;
	}
	
	@Override
	public String toString()
	{
		String temp = "";
		temp += lastName + ", " + firstName + "--" +dateOfBirth + " Student ID:" + studentID;
		
		
		return temp;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(this == other)
			return true;
			
		if(!(other instanceof Student))
			return false;
			
		Student p = (Student)other;
		
		if (this.studentID == p.studentID)
			return true;
			
		return false;
	}
	
	public int compareTo(Student other)
	{		
		if(this.lastName.compareTo(other.lastName) == 0)
			return firstName.compareTo(other.firstName);
		return lastName.compareTo(other.lastName);
	}
	
	
}

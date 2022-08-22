public class Teacher implements Comparable <Teacher>
{

	private int teacherID;
	private String firstName;
	private String lastName;

	
	public Teacher(String firstName, String lastName, int teacherID)
	{
		
		this.firstName=firstName;	
		this.lastName=lastName;
		this.teacherID=teacherID;

	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getTeacherID()
	{
		return teacherID;
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
	
	
	@Override
	public String toString()
	{
		
		String temp = "";
		temp += lastName + ", " + firstName + "--" + "Teacher ID:" + teacherID;
		
		return temp;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(this == other)
			return true;
			
		if(!(other instanceof Teacher))
			return false;
			
		Teacher p = (Teacher)other;
		
		if (this.teacherID == p.teacherID)
			return true;
			
		return false;
	}
	
	public int compareTo(Teacher other)
	{		
		if(this.lastName.compareTo(other.lastName) == 0)
			return firstName.compareTo(other.firstName);
		return lastName.compareTo(other.lastName);
	}
	
}

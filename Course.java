public class Course implements Comparable <Course>
{

	public static final int GR9 = 9;
	public static final int GR10 = 10;
	public static final int GR11 = 11;
	public static final int GR12 = 12;

		
	
	private Subject subject;
	private Level level;
	private int grade;
	private String name;
	private String description;
	private String code;

	
	
	
	public Course(String name, int grade, String description, Subject subject, Level level, String code)
	{
		this.name=name;	
		

		this.grade=grade;


		this.description=description;
		
		this.subject=subject;
		
		this.level=level;
		
		this.code=code;

	}
	//***********
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}

	
	public String getDescription()
	{
		return description;
	}
	
	public Subject getSubject()
	{
		return subject;
	}
	
	public Level getLevel()
	{
		return level;
	}
	
	public String getCode()
	{
		return code;
	}
	
	//*************
	
	public String setDescription(String s)
	{
		return description;
	}
	
	public String setName(String s)
	{
		return name;
	}
	
	public Subject setSubject(Subject s)
	{
		return subject;
	}
	
	
	
	@Override
	public String toString()
	{
		String temp = "";
		temp += "Subject:" + subject + "\n";
		temp += "Course: " + name + " --- ";
		temp += description + "\n";
		temp += "Level: " + level + "\n";
		temp += "Grade: " + grade + "\n";
		temp += "Course Code: " + code + "\n";
		
		return temp;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(this == other)
			return true;
			
		if(!(other instanceof Course))
			return false;
			
		Course p = (Course)other;
		
		if (this.code == p.code)
			return true;
			
		return false;
	}
	
	public int compareTo(Course other)
	{
		if(this.name.compareTo(other.name) == 0)
			{
			if(this.grade < other.grade)
				return -1;
			else if(this.grade > other.grade)
				return 1;
			return 0;
			}
		return name.compareTo(other.name);
	}
}

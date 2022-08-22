public class CourseSection implements Comparable<CourseSection>
{

	private int courseNumber;
	private Course course;
	private StudentGroup students;
	private Teacher teacher;
	private Location location;


	
	
	
	public CourseSection(Course course, StudentGroup students, int courseNumber, Teacher teacher, Location location)
	{
		this.course=course;
		this.students=students;
		this.teacher=teacher;
		this.location=location;
		this.courseNumber=courseNumber;

	}
	//***********
	public Course getCourse()
	{
		return course;
	}
	
	public StudentGroup getStudents()
	{
		return students;
	}

	public int getCourseNumber()
	{
		return courseNumber;
	}
	
	public Teacher getTeacher()
	{
		return teacher;
	}
	
	public Location getLocation()
	{
		return location;
	}
	
	
	//*************
	
	public Course setCourse(Course s)
	{
		return course;
	}
	
	public int setCourseNumber(int s)
	{
		return courseNumber;
	}
	
	public Teacher setTeacher(Teacher s)
	{
		return teacher;
	}
	
	public Location setLocation(Location s)
	{
		return location;
	}
	
	
	public void addStudents(Student s)
	{
		students.add(s);
	}
	
	public void removeStudents(Student s)
	{
		students.remove(s);
	}
	
	public void removeStudents(int i)
	{
		students.remove(i);
	}
	
	public int checkStudent(Student s)
	{
		return students.get(s);
	}
	
	
	public int compareTo(CourseSection other)
	{
		if (course.compareTo(other.course)==0)
		{
			if(this.courseNumber < other.courseNumber)
				return -1;
			else if(this.courseNumber > other.courseNumber)
				return 1;
			return 0;
		}
		return course.compareTo(other.course);
			
			
	}
	
	public String toString2()
	{
		String temp = "";
		temp += getCourse().getName();
		temp += "/" + getTeacher().getLastName();
		temp += "/" + location;
		temp += "/Course Number: " + courseNumber + "\n";
		temp += "\n" + students;
		
		
		return temp;
	}
	
	
	@Override
	public String toString()
	{
		String temp = "";
		temp += getCourse().getName();
		temp += "/" + getTeacher().getLastName();
		//temp += " Students" + students;
		temp += "/" + location;
		temp += "/Course Number: " + courseNumber;
		
		
		return temp;
	}
	
}

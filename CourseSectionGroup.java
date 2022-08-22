import java.util.*;

class CourseSectionGroup
{
	ArrayList<CourseSection> courseSectionGroup = new ArrayList<>();

	public void add(CourseSection s)
	{
		courseSectionGroup.add(s);
	}
	
	public void remove(CourseSection s)
	{
		courseSectionGroup.remove(s);
	}
	
	public void remove(int i)
	{
		courseSectionGroup.remove(i);
	}
	
	public CourseSection get(int i)
	{
		CourseSection l = courseSectionGroup.get(i);
		return l;
	}
	
	public int get(CourseSection s)
	{
		for(int i = 0; i < courseSectionGroup.size(); i++)
		{
			if (courseSectionGroup.get(i)==(s))
				return i; 
			return -1; 
		}
		return -1;
	}
	
	public int size()
	{
		int l = courseSectionGroup.size();
		return l;
	}
	
	
//public String toString2()
	{
	//	Collections.sort(courseSectionGroup);
	//	String temp = "";
//		for(int i=0; i<courseSectionGroup.size(); i++)
		{
//			temp += (i+1) + "." + courseSectionGroup.get(i).getCourse().getName() + " / " + courseSectionGroup.get(i).getTeacher().getLastName() + ", " + courseSectionGroup.get(i).getTeacher().getFirstName() + "/ " + courseSectionGroup.get(i).getLocation() + " / Course Section Number: " + courseSectionGroup.get(i).getCourseNumber() + "\n";
	//		for(int x=0; x<courseSectionGroup.get(i).getStudents().size(); x++)
	//			temp += courseSectionGroup.get(i).getStudents().get(i).getLastName()  + ", " + courseSectionGroup.get(i).getStudents().get(x).getFirstName() + " / " ;
		}
		
		
		//return temp;
	}
	
	
	@Override
	public String toString()
	{
		Collections.sort(courseSectionGroup);
		String temp = "";
		for(int i=0; i<courseSectionGroup.size(); i++)
			temp += (i+1) + "." + courseSectionGroup.get(i).getCourse().getName() + " / " + courseSectionGroup.get(i).getTeacher().getLastName() + ", " + courseSectionGroup.get(i).getTeacher().getFirstName() + "/ " + courseSectionGroup.get(i).getLocation() + " / Course Section Number: " + courseSectionGroup.get(i).getCourseNumber() + "\n";
		
		
		return temp;
	}
	

}

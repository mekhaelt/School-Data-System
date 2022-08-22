import java.util.*;

class CourseGroup
{
	ArrayList<Course> courseGroup = new ArrayList<>();

	public void add(Course s)
	{
		courseGroup.add(s);
	}
	
	public void remove(Course s)
	{
		courseGroup.remove(s);
	}
	
	public void remove(int i)
	{
		courseGroup.remove(i);
	}
	
	public Course get(int i)
	{
		Course l = courseGroup.get(i);
		return l;
	}
	
	public int get(Course s)
	{
		for(int i = 0; i < courseGroup.size(); i++)
		{
			if (courseGroup.get(i)==(s))
				return i; 
			return -1; 
		}
		return -1;
	}
	
	public int size()
	{
		int l = courseGroup.size();
		return l;
	}
	
	@Override
	public String toString()
	{
		Collections.sort(courseGroup);
		String temp = "";
		for(int i=0; i<courseGroup.size(); i++)
			temp += (i+1) + ". " + courseGroup.get(i) + "\n";
		
		
		return temp;
	}
	

}

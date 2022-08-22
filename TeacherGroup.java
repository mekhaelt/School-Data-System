import java.util.*;

class TeacherGroup
{
	ArrayList<Teacher> teacherGroup = new ArrayList<>();

	public void add(Teacher s)
	{
		teacherGroup.add(s);
	}
	
	public void remove(Teacher s)
	{
		teacherGroup.remove(s);
	}
	
	public void remove(int i)
	{
		teacherGroup.remove(i);
	}
	
	public Teacher get(int i)
	{
		Teacher l = teacherGroup.get(i);
		return l;
	}
	
	public int get(Teacher s)
	{
		for(int i = 0; i < teacherGroup.size(); i++)
		{
			if (teacherGroup.get(i)==(s))
				return i; 
			return -1; 
		}
		return -1;
	}
	
	public int size()
	{
		int l = teacherGroup.size();
		return l;
	}
	
	@Override
	public String toString()
	{
		Collections.sort(teacherGroup);
		String temp = "";
		for(int i=0; i<teacherGroup.size(); i++)
			temp += (i+1) + ". " + teacherGroup.get(i) + "\n";
		
		
		return temp;
	}
	

}

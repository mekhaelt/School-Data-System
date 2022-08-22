import java.util.*;


class StudentGroup 
{
	ArrayList<Student> studentGroup = new ArrayList<>();

	public void add(Student s)
	{
		studentGroup.add(s);
	}
	
	public void remove(Student s)
	{
		studentGroup.remove(s);
	}
	
	public void remove(int i)
	{
		studentGroup.remove(i);
	}
	
	public Student get(int i)
	{
		Student l = studentGroup.get(i);
		return l;
	}
	
	public int get(Student s)
	{
		for(int i = 0; i < studentGroup.size(); i++)
		{
			if (studentGroup.get(i)==(s))
				return i; 
		}
		return -1;
	}
	
	public int size()
	{
		int l = studentGroup.size();
		return l;
	}
	
	
	
	
	@Override
	public String toString()
	{
		Collections.sort(studentGroup);
		String temp = "";
		for(int i=0; i<studentGroup.size(); i++)
			temp += (i+1) + ". " + studentGroup.get(i) +"\n";
		
		
		return temp;
	}
	

}

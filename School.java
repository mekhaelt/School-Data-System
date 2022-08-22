import java.util.*;
import java.time.LocalDate;
public class School
{
	private StudentGroup studentList=new StudentGroup();
	private TeacherGroup teacherList=new TeacherGroup();
	private CourseGroup courseList=new CourseGroup();
	private CourseSectionGroup courseSectionList=new CourseSectionGroup();
	
	private int currentMenu;
	private final int MAIN_MENU = 0;
	private final int COURSE_MENU = 3;
	private final int STUDENT_MENU = 1;
	private final int TEACHER_MENU = 2;
	
	public static void main(String[] args)
	{
		School school = new School();
		school.Addd();
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		school.run();
		
		
	}
	
	
	
	public void run()
	{
		
		do
		{
			if(currentMenu == MAIN_MENU)
				mainMenu();
			if(currentMenu == COURSE_MENU)
				courseMenu();		
			if(currentMenu == STUDENT_MENU)
				studentMenu();
			if(currentMenu == TEACHER_MENU)
				teacherMenu();
		} 
		while (true);
	}
	
	public void mainMenu()
	{
		Scanner in = new Scanner(System.in);
		
		
		currentMenu=0;
		System.out.println("########MENU########");
		System.out.println();
		System.out.println("1) Student Menu");
		System.out.println("2) Teacher Menu");
		System.out.print("3) Course Menu");
		int menu = in.nextInt();
		currentMenu=menu;
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		
	
	}
	
	//Student Menu
	public void studentMenu()
	{
		Scanner in = new Scanner(System.in);
		
		
		int smenu;
		System.out.println("########STUDENT MENU########");
		System.out.println();
		System.out.println("1) Add a student");
		System.out.println("2) Delete a student");
		System.out.println("3) View student info");
		System.out.println("4) View all students");
		System.out.println("5) Return to main menu");
		smenu = in.nextInt();
		boolean cont=false;
		
		
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		if (smenu==1)
		{
			System.out.print("What is the student's first name? ");
			String firstName=in.next();
			System.out.print("What is the student's last name? ");
			String lastName=in.next();
			System.out.print("When was the student born?\nYear: ");
			int year=in.nextInt();
			System.out.print("Month(ex. January=01): ");
			int month=in.nextInt();
			System.out.print("day: ");
			int day=in.nextInt();
			System.out.print("What is the studentID number? ");
			int studentID=in.nextInt();
			Student s1 = new Student(firstName, lastName, studentID, LocalDate.of(year, month, day));
			studentList.add(s1);
			System.out.print(firstName + " " + lastName + " was added!");
			clear();
		

		}
		if (smenu==2)
		{
			System.out.println(studentList);
			System.out.print("Which student do you want to delete? ");
			int del=in.nextInt();
			studentList.remove(del-1);
			System.out.print("They were successfully deleted!");
			
			
			clear();
		}
	
		if (smenu==3)
		{
			System.out.println(studentList);
			System.out.println("Which student do you want to view");
			int i=in.nextInt();
			for(int j=0; j<50; j++)
			{
				System.out.println();
			}
			Student s=studentList.get(i-1);
			System.out.println();
			System.out.print(s);
			getStud(s);
			
		
			clear();
		}
			
		
			
		if (smenu==4)
		{
			System.out.println(studentList);
			
			clear();
		}

			
		if (smenu==5)
		{
			currentMenu=0;
		}
	}
	
	//Teacher Menu
	public void teacherMenu()
	{
		
		Scanner in = new Scanner(System.in);
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		int smenu;
		
		System.out.println("########TEACHER MENU########");
		System.out.println();
		System.out.println("1) Add a Teacher");
		System.out.println("2) Delete a teacher");
		System.out.println("3) View all teacher");
		System.out.println("4) Return to main menu");
		smenu = in.nextInt();
		boolean cont=false;
		
		
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		if (smenu==1)
		{
			System.out.print("What is the teacher's first name? ");
			String firstName=in.next();
			System.out.print("What is the teacher's last name? ");
			String lastName=in.next();
			System.out.print("What is the teacherID number? ");
			int studentID=in.nextInt();
			
			Teacher s1 = new Teacher(firstName, lastName, studentID);
			teacherList.add(s1);
			System.out.print(firstName + " " + lastName + " was added!");
			clear();
		
		}
		if (smenu==2)
		{
			System.out.println(teacherList);
			System.out.print("Which teacher do you want to delete? ");
			int del=in.nextInt();
			teacherList.remove(del-1);
			System.out.print("They were successfully deleted!");
			clear();
			

		}
		
		if (smenu==3)
		{
			System.out.println(teacherList);
			clear();

		}
		if (smenu==4)
			currentMenu=0;
			
	}
	
	//Course Menu
	public void courseMenu()
	{
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		int smenu;
		
		System.out.println("########COURSE MENU########");
		System.out.println();
		System.out.println("1) Add a course");
		System.out.println("2) Delete a course");
		System.out.println("3) View all courses");
		System.out.println("4) Add a course section");
		System.out.println("5) Delete a course section");
		System.out.println("6) Add a student to a course section");
		System.out.println("7) Delete a student from a course section");
		System.out.println("8) View a course section");
		System.out.println("9) View all course sections");
		System.out.println("10) Return to main menu");
		smenu = in.nextInt();
		boolean cont=false;
		
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
		
		if (smenu==1)
		{
			in.nextLine();
			System.out.print("What is the courses name? ");
			String name = in.nextLine();
			System.out.print("What is the grade of the course? ");
			int grade=in.nextInt();
			in.nextLine();
			System.out.print("What is the description of the course? ");
			String description = in.nextLine();
			System.out.println("1) Math\n2) Business\n3) Music\n4) Computer Studies\n5) Technology\n");
			System.out.println("Choose a subject for the course");
			int sub=in.nextInt();
			System.out.println();
			Subject subject=Subject.MATH;
			if(sub==1)
				 subject=Subject.MATH;
			if(sub==2)
				subject=Subject.BUSINESS;;
			if(sub==3)
				subject=Subject.MUSIC;
			if(sub==4)
				subject=Subject.COMPUTER_STUDIES;
			if(sub==5)
				subject=Subject.TECHNOLOGY;
			
			System.out.println("1) Open\n2) Mixed\n3) College\n4) University\n");
			System.out.println("Choose a level for the course");
			int lev=in.nextInt();
			System.out.println();
			Level level=Level.O;
			if(lev==1)
				 level=Level.O;
			if(lev==2)
				level=Level.M;;
			if(lev==3)
				level=Level.C;
			if(lev==4)
				level=Level.U;
				
			System.out.print("What is the course code?");
			String code=in.next();
			
			
			
			
			Course s1 = new Course(name, grade, description, subject, level, code);
			courseList.add(s1);
			System.out.print(name + " was added!");
			clear();
		
		}
		if (smenu==2)
		{
			System.out.println(courseList);
			System.out.print("Which course do you want to delete? ");
			int del=in.nextInt();
			courseList.remove(del-1);
			System.out.print("They were successfully deleted!");
			
			
			clear();
		}
		
		
		if (smenu==3)
		{
			System.out.println(courseList);
			clear();
		}
		
		
		if (smenu==4)
		{
			System.out.println(courseList.toString());
			System.out.print("What course do you want?");
			int c=in.nextInt();
			Course course= courseList.get(c-1);
			StudentGroup l = new StudentGroup();
			
			System.out.println(teacherList.toString());
			System.out.print("What teacher do you want?");
			int t=in.nextInt();
			Teacher teacher= teacherList.get(t-1);
			
			System.out.println("1) Room 01\n2) Room02");
			System.out.println("Choose a location for the course");
			int roo=in.nextInt();
			
			System.out.print("What course number do you want?");
			int n=in.nextInt();
			
			Location room=Location.RM01;
			if(roo==1)
				 room=Location.RM01;
			if(roo==2)
				room=Location.RM02;
			CourseSection s1 = new CourseSection(course, l, n, teacher, room);
			courseSectionList.add(s1);
			clear();
	
		}
		
		
		if (smenu==5)
		{
			System.out.println(courseSectionList);
			System.out.print("Which course section do you want to delete? ");
			int del=in.nextInt();
			courseSectionList.remove(del-1);
			System.out.print("They were successfully deleted!");
			
			
			clear();
		}
		
				if (smenu==6)
		{
			
			System.out.println(courseSectionList);
			System.out.print("Which course section do you want to add a student to? ");
			int add1=in.nextInt();
			CourseSection z = courseSectionList.get(add1-1);
			System.out.println(studentList);
			System.out.print("Which student do you want to add? ");
			int add=in.nextInt();
			Student j = studentList.get(add-1);
			z.addStudents(j);
			System.out.print("They were successfully added!");
			clear();
		}
		
		
			if (smenu==7)
		{
			
			System.out.println(courseSectionList);
			System.out.print("Which course section do you want to delete a student from? ");
			int del1=in.nextInt();
			CourseSection z = courseSectionList.get(del1-1);
			System.out.println(z.getStudents());
			System.out.print("Which student do you want to delete? ");
			int del=in.nextInt();
			
			Student j = studentList.get(del-1);
			
			
			z.removeStudents(j);
			System.out.print("They were successfully deleted!");
			clear();
		}
		
		if (smenu==8)
		{
			System.out.println(courseSectionList);
			System.out.println("Which Course Section do you want to view");
			int i=in.nextInt();
			for(int j=0; j<50; j++)
			{
				System.out.println();
			}
			CourseSection s=courseSectionList.get(i-1);
			System.out.print(s.toString2());
			
		
			clear(); 
		}
		
		if (smenu==9)
		{
			System.out.println(courseSectionList);
			clear();
		}
		
		if (smenu==10)
		{
			currentMenu=0;
		}

	}
	public  void getStud(Student d)
	{
		for (int i=0; i<courseSectionList.size(); i++)
		{
			int lm = courseSectionList.get(i).checkStudent(d);
			if (lm!=-1)
			
			{
				System.out.print("\n" +courseSectionList.get(i));
			}
		}
			
		
	}
	
	public void clear()
	{
		Scanner in = new Scanner(System.in);
		System.out.println();
			System.out.println("Type c to continue");
			char cont='d';
			while (cont!= 'c')
			{
				cont=in.next().charAt(0);
			}
		for(int i=0; i<50; i++)
		{
			System.out.println();
		}
	}
	
	//Not essential- is just used to more easily test out the code
	public void Addd()
    {
		Student d = new Student( "Sam", "Smith", 510010076, LocalDate.of(2004, 05, 03));
		Student s = new Student( "Justin", "Beiber", 521002109, LocalDate.of(2004, 03, 06));
		Student r = new Student("Taylor", "Swift", 510056788, LocalDate.of(2004, 07, 07));
                         
		studentList.add(d);
		studentList.add(s);
		studentList.add(r);               
		
		Teacher t = new Teacher( "Shaquille", "O'Neal'", 5213891);
        Teacher t1 = new Teacher("Christiano", "Ronaldo", 5853891);
        Teacher t2 = new Teacher("Lionel", "Messi", 5853891);
        Teacher t3 = new Teacher("Lebron", "James", 5213245);
                          
        teacherList.add(t);
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);
                          
        Course c = new Course("Calculus", 12, "Very Fun, PLease Take Course", Subject.MATH, Level.U, "CALC01");
        Course b = new Course("Business", 11, "Very Fun, PLease Take Course", Subject.BUSINESS, Level.M, "BUSI01");
        Course m = new Course("Band", 10, "Very Fun, PLease Take Course", Subject.MUSIC, Level.C, "BAND01");
        Course tx = new Course("Robotics", 9, "Very Fun, PLease Take Course", Subject.TECHNOLOGY, Level.O, "ROBO01");
                          
        courseList.add(c);
        courseList.add(b);
        courseList.add(m);
        courseList.add(tx);
        
  
    }
		
	
	
	
		
	
	
}

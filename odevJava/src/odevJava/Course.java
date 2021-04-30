package odevJava;

public class Course {
	
	public Course()
	{
		System.out.println("Kurs Nesnesi");
				
	}
	
	public Course(int id,String name,int categoryId,int InstructorId)
	{
		this.id=id;
		this.name=name;
		this.categoryId=categoryId;
		this.InstructorId=InstructorId;
		
	}
	
	
	int id;
	String name;
	int categoryId;
	int InstructorId;
	
	}




package odevJava;

public class Course {
	
	public Course()
	{
		System.out.println("Kurs Nesnesi");
				
	}
	
	public Course(int id,String name,int categoryId,int educatorId)
	{
		this.id=id;
		this.name=name;
		this.categoryId=categoryId;
		this.educatorId=educatorId;
		
	}
	
	
	int id;
	String name;
	int categoryId;
	int educatorId;
	
	}



/*site üzerindeki özellik nesnelerine örnek
Kurs nesnesi (id, courseName)
Eðitmen nesnesi (id,educatorName,...)*/
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



/*site �zerindeki �zellik nesnelerine �rnek
Kurs nesnesi (id, courseName)
E�itmen nesnesi (id,educatorName,...)*/
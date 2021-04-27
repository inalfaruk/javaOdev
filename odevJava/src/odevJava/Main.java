package odevJava;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course courses1=new Course();
		courses1.categoryId=1;
		courses1.educatorId=1;
		courses1.id=1;
		courses1.name="C# Ýleri Düzey";
		
		
		Course courses2=new Course();
		courses2.categoryId=1;
		courses2.educatorId=1;
		courses2.id=2;
		courses2.name="C# Temel";
		
		Course courses3=new Course();
		courses3.categoryId=2;
		courses3.educatorId=2;
		courses3.id=3;
		courses3.name="Java Temel";
		
		
		
Course[] courses = {courses1,courses2,courses3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
	}

}

package odevJava;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student ogrenci1 = new Student();
		
		ogrenci1.id=1;
		ogrenci1.name="faruk inal";
		ogrenci1.email="farukinal16@gmail.com";
		ogrenci1.password="123";
		ogrenci1.phone="055";
		ogrenci1.userType=1;
		ogrenci1.Exam1=70;
		ogrenci1.Exam2=80;
		
		
	   
	    StudentManager studentManager = new StudentManager();
	    studentManager.Add(ogrenci1);
	    
	    UserManager userManager = new UserManager();
	    userManager.loginControl(ogrenci1.userType);
	   
	    
	    studentManager.calculateResult(ogrenci1.Exam1,ogrenci1.Exam2);
	    
		
		
		
		
		Course courses1=new Course();
		courses1.categoryId=1;
		courses1.InstructorId=1;
		courses1.id=1;
		courses1.name="C# Ýleri Düzey";
		
		
		Course courses2=new Course();
		courses2.categoryId=1;
		courses2.InstructorId=1;
		courses2.id=2;
		courses2.name="C# Temel";
		
		Course courses3=new Course();
		courses3.categoryId=2;
		courses3.InstructorId=2;
		courses3.id=3;
		courses3.name="Java Temel";
		
		
		
Course[] courses = {courses1,courses2,courses3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
	}

}

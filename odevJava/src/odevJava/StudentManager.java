package odevJava;

public class StudentManager {

	
	
	public void calculateResult(double Exam1, double Exam2) {
		
		System.out.println("Not Ortalamas� : " + (Exam1 + Exam2)/2);		
	}
	
	
	
	public void Add(Student student) {
		
		System.out.println(student.name + " isimli ��renci eklendi");		
	}
	
	public void Update(Student student) {
		
		System.out.println("��renci g�ncellendi");		
	}
	
	public void Delete(Student student) {
		
		System.out.println("��renci silindi");		
	}
	
	
	
	
}

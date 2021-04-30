package odevJava;

public class StudentManager {

	
	
	public void calculateResult(double Exam1, double Exam2) {
		
		System.out.println("Not Ortalamasý : " + (Exam1 + Exam2)/2);		
	}
	
	
	
	public void Add(Student student) {
		
		System.out.println(student.name + " isimli öðrenci eklendi");		
	}
	
	public void Update(Student student) {
		
		System.out.println("Öðrenci güncellendi");		
	}
	
	public void Delete(Student student) {
		
		System.out.println("Öðrenci silindi");		
	}
	
	
	
	
}

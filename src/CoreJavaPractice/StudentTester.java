package CoreJavaPractice;

public class StudentTester {

	
	private int studentId;
	private String name;
	private  float qualifyingExamMarks;
	private char residentialStatus; 
	private int yearOfEngg;
	
	
	
	public StudentTester() {
		
	}
	public StudentTester(int studentId, String name, float qualifyingExamMarks, char residentialStatus,
			int yearOfEngg) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.yearOfEngg = yearOfEngg;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	} 


public static void main(String[]args) {
	
	StudentTester student1 = new StudentTester(1, "Adam",(float) 99.33, 'N',
		2020);
	System.out.println("Id: "+ student1.getStudentId()+" Name: "+student1.getName()+ student1.getQualifyingExamMarks()+student1.getResidentialStatus()+student1.getYearOfEngg());
	
	
}
}


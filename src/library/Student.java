package library;

public class Student {

	int StudentId;
	String StudentName;
	String Dept;
	int Year;
	
	Student(int StudentId, String StudentName, String Dept, int Year){
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.Dept = Dept;
		this.Year = Year;
	}

	public int getStudentId() {
		return StudentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public String getDept() {
		return Dept;
	}

	public int getYear() {
		return Year;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public void setYear(int year) {
		Year = year;
	}
	
}

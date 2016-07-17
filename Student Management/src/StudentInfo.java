
public class StudentInfo {
	private String studentName;
	private int studentID;
	private String studentPhone;
	
	public StudentInfo(String studentName, int studentID, String studentPhone) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentPhone = studentPhone;
	}
	
	public void displayInfo(){
		System.out.println("Student Name: "+studentName+"\n Student ID: "+studentID+ "\nPhone Number: "+studentPhone);
	}
	
}

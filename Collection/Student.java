import java.util.Comparator;

public class Student implements Comparator<Object>{
	int student_id;
	String student_name;
	int student_roll;
	public Student(int student_id, String student_name, int student_roll) {
		
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_roll = student_roll;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_roll=" + student_roll
				+ "]";
	}
	
	
	

}

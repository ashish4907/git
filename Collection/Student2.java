import java.util.Comparator;

public class Student2 implements Comparator<Student2>{
	private int student_id;
	private String student_name;
	private int student_roll;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_roll() {
		return student_roll;
	}
	public void setStudent_roll(int student_roll) {
		this.student_roll = student_roll;
	}
	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o1.student_id-o2.student_id;
	}
	@Override
	public String toString() {
		return "Student2 [student_id=" + student_id + ", student_name=" + student_name + ", student_roll="
				+ student_roll + "]";
	}
	
}

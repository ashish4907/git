import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "nidhi", 12);
		Student s2 = new Student(2, "nikita", 22);
		Student s3 = new Student(3, "megha", 13);
		Student s4 = new Student(4, "sony", 45);

		List<Student> student_list = new ArrayList<>();
		student_list.add(s1);
		student_list.add(s2);
		student_list.add(s3);
		student_list.add(s4);

		System.out.println("------for-each loop-----------");
		for (Student s : student_list) {
			System.out.println(s.student_id + " " + s.student_name + " " + s.student_roll);
		}

		System.out.println("--------Iterator------------");
		Iterator<Student> iter = student_list.iterator();
		while (iter.hasNext()) {
			Student stu = iter.next();
			System.out.println(stu.student_id + " " + stu.student_name + " " + stu.student_roll);
		}
		System.out.println("-------stream------------");

		student_list.stream()
				.forEach(e -> System.out.println(e.student_id + " " + e.student_name + " " + e.student_roll));

		System.out.println("-------arraylIST TO lINKEDLIST----------");
		List<Student> linked_list = new LinkedList<>(student_list);
		System.out.println(linked_list);
		linked_list.stream()
				.forEach(e -> System.out.println(e.student_id + " " + e.student_name + " " + e.student_roll));

		System.out.println("-----Comparator via override compare----------");
		List<Student> sorted = linked_list.stream().sorted((o1, o2) -> o1.student_roll - o2.student_roll)
				.collect(Collectors.toList());
		System.out.println(sorted);

	}
}

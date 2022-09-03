import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Test2 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.setStudent_id(105);
		s1.setStudent_name("Radha");
		s1.setStudent_roll(10);

		Student2 s2 = new Student2();
		s2.setStudent_id(102);
		s2.setStudent_name("meera");
		s2.setStudent_roll(11);
		Student2 s3 = new Student2();
		s3.setStudent_id(103);
		s3.setStudent_name("jaya");
		s3.setStudent_roll(12);
		List<Student2> arrayList = new ArrayList<>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);

		System.out.println("  ------------------ For- Each lop--------------");
		for (Student2 stud : arrayList) {
			System.out.println(stud.getStudent_id() + "   " + stud.getStudent_name() + "  " + stud.getStudent_roll());

		}

		System.out.println("---------------Using Iterator -------------");
		Iterator<Student2> itr = arrayList.iterator();
		while (itr.hasNext()) {
			Student2 stud = itr.next();
			System.out.println(stud.getStudent_id() + "   " + stud.getStudent_name() + "  " + stud.getStudent_roll());
		}
		System.out.println("----------------------------------- Using Stream-------------");
		arrayList.stream().forEach(
				e -> System.out.println(e.getStudent_id() + "  " + e.getStudent_name() + "   " + e.getStudent_roll()));

		System.out.println("-----------Convering ArrayList Into Linked List-------------");
		List<Student2> list = new LinkedList<>(arrayList);
		list.stream().forEach(
				e -> System.out.println(e.getStudent_id() + "  " + e.getStudent_name() + "   " + e.getStudent_roll()));

		System.out.println("----------Sorting using compareTo name (Comparable)----------------");
		List<Student2> sortingList = sortingList(arrayList);
		sortingList.stream().forEach(
				e -> System.out.println(e.getStudent_id() + "  " + e.getStudent_name() + "   " + e.getStudent_roll()));

		System.out.println("-----------sorting using compare id (Comparator)---------");

		List<Student2> sorted = arrayList.stream().sorted((o1, o2) -> o1.getStudent_id() - o2.getStudent_id())
				.collect(Collectors.toList());
		System.out.println(sorted);

	}

	private static <T> List<T> sortingList(List<T> list) {

		list.sort((o1, o2) -> ((Student2) o1).getStudent_name().compareToIgnoreCase(((Student2) o2).getStudent_name()));
		return list;

	}

}

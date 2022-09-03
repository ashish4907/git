import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Employee_main {
	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<>();
		treemap.put(121, "Shreya");
		treemap.put(161, "Nidhi");
		treemap.put(89, "Mohini");
		System.out.println(treemap.entrySet().getClass().getSimpleName());
		for (Entry<Integer, String> r : treemap.entrySet()) {
			System.out.println(r.getKey() + " " + r.getValue());
		}
		System.out.println("-----------Converting map to set----------");
		Set<Entry<Integer, String>> e = treemap.entrySet();
		System.out.println("and iterate through stream");
		e.stream().forEach(es -> System.out.println(es.getKey() + " " + es.getValue()));

		System.out.println("---------- and iterate through iterator-----");
		Iterator<Entry<Integer, String>> iterator = e.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey() + " " + next.getValue());
		}

	}
}

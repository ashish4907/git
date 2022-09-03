import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Car_main {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCar_name("Volvo");
		c1.setCar_price(234567);
		Car c2 = new Car();
		c2.setCar_name("Tata");
		c2.setCar_price(134567);
		Car c3 = new Car();
		c3.setCar_name("Safari");
		c3.setCar_price(534567);
		
		LinkedHashMap<String, Car> e = new LinkedHashMap<>();
		e.put("First", c1);
		e.put("Second", c2);
		e.put("Third", c3);
		
//		Set<Entry<String,Car>> set = e.entrySet();
//		
//		set.stream().forEach(er-> System.out.println(er.getKey()+" "+er.getValue().getCar_name()+" "+er.getValue().getCar_price()));
//	
		ArrayList<Entry<String,Car>> list = new ArrayList<>(e.entrySet());
		list.stream().forEach(er->System.out.println(er.getValue().getCar_name()));
		
		Iterator<Entry<String, Car>> iterator = list.iterator();
		while(iterator.hasNext()) {
			Entry<String, Car> next = iterator.next();
			System.out.println(next.getValue().getCar_price());
		}
		
	}

}

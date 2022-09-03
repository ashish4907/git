import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BMW_AUDI_CAR {
public static void main(String[] args) {
	BMW bmw = new BMW(12, "X2");
	Audi audi = new Audi(15, "R8");

	TreeMap<String, Object> treemap = new TreeMap<String, Object>();
	treemap.put("First", bmw);
	treemap.put("Second", audi);
	
	Set<Entry<String, Object>> e = treemap.entrySet();

	for (Entry<String, Object> entry : e) {
		if(entry.getValue() instanceof BMW) {
			BMW BMWS = (BMW) entry.getValue();
			System.out.println(BMWS.id + " " + BMWS.name);
		}
		if(entry.getValue() instanceof Audi) {
			Audi audis = (Audi) entry.getValue();
			System.out.println(audis.id+" "+audis.name);
		}
	}
}
}

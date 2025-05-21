package nrcm;
import java.util.*;
public class day9_4 {
	public static void main(String[] args) {
		/*Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "Venkat");
		m1.put(2, "Ram");
		m1.put(3, "Raghu");
		m1.put(4, "Nithin");
		m1.put(5, "Shiva");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}*/
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(1, "Venkat");
		m1.put(2, "Ram");
		m1.put(3, "Raghu");
		m1.put(4, "Nithin");
		m1.put(5, "Shiva");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}

}

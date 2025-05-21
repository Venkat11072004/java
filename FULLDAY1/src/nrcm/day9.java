package nrcm;
import java.util.*;
public class day9 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(62);
		List<Object> l2=new ArrayList<Object>();
		l2.add(12);
		l2.add(34);
		l2.add(65);
		l2.addAll(l1);
		l2.add(null);
		System.out.println(l2);
		Iterator i1=l2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}

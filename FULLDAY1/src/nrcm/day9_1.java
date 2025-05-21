package nrcm;
import java.util.*;
public class day9_1 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(23);
		l1.add(67);
		l1.add(2,67);
		System.out.println(l1);
		List<Object> extra=Arrays.asList(12,13,14);
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(13));
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}
	}

}

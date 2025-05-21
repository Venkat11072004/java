package nrcm;
import java.util.*;
public class day9_2 {

	public static void main(String[] args) {
		//Arraylist
		/*int[] arr1= {76,23,98,45,90};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 90);
		System.out.println(a);
		for(int b1:arr1)
			System.out.println(b1);
		    System.out.println();*/
		//Linked list
		/*LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(12);
		l1.add(11);
		l1.add(46);
		l1.add(22);
		l1.add(3);
		l1.addFirst(46);
		l1.addLast(95);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(46);
		l1.remove(1);
		System.out.println(l1);*/
		//Stack
		/*Stack<Integer> s1=new Stack<Integer>();
		s1.push(23);
		s1.push(56);
		s1.push(75);
		s1.push(12);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}*/
		//Vector
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(12);
		v1.add(13);
		v1.add(14);
		v1.add(15);
		System.out.println(v1);
		Enumeration i1=v1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		
	}
}

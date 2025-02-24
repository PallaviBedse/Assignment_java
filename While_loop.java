package assigment_module;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//WAP to implement while loop
public class While_loop {

	public static void main(String[] args) {
	
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(78);
		l1.add(34);
		l1.add(56);
		System.out.println(l1);
		ListIterator<Integer> i1=l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}

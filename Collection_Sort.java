package assigment_module;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Sort {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(120);
		a1.add(34);
		a1.add(67);
		a1.add(43);
		a1.add(76);
		a1.add(89);
		System.out.println("Before Sorting");
		System.out.println(a1);
		System.out.println("After Sorting");
		Collections.sort(a1);
		System.out.println(a1);
		

	}

}

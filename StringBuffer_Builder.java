package assigment_module;
//Write a program to demonstrate the following functions 
//like append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) 
//& substring (start & end index) using StringBuffer concept
public class StringBuffer_Builder {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("Pallavi");
		//PallaviDineshPatil
		//123456789012345678
		b1.append("Patil");
		b1.insert(7, "Dinesh");
		System.out.println(b1);
		b1.replace(7, 13, "Antara");
		System.out.println(b1);
		b1.delete(7, 13);//jaha se delete krna he 8-1 to 13
		System.out.println(b1);
		String s1 =b1.substring(7);
		System.out.println(s1);
		String s2 = b1.substring(0, 7);//start index is 0
		System.out.println(s2);
		b1.reverse();
		System.out.println(b1);
		int z =b1.capacity();
		System.out.println(z);
		int i = b1.length();
		System.out.println(i);
		char c1 = b1.charAt(7);
		System.out.println(c1);
		//b1.subSequence(7,13);
	}

}

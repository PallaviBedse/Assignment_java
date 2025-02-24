package assigment_module;

public class Array_index_num {
// WAP to check if 24 is  apart of your array if yes print its indexing
	public static void main(String[] args) {
     		
		 int array1[]= new int[4];

		 array1[0]=12;
		 array1[1]=23;
		 array1[2]=34;
		 array1[3]=45;
		 
		 int numcheck=126;
		 
		 for (int i = 0;i<=array1.length-1;i++)
		 {
			 if(numcheck==array1[i])
			 {
				 System.out.println("the number is present in array");
					 break;
			 }else {
				 System.out.println("the number is not present in array");
			 }
		 }
		 
			 
    }
}
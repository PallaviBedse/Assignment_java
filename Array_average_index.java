package assigment_module;

public class Array_average_index {

	public static void main(String[] args) {
		int input[]= new int [5];
		input[0]=2;
		input[1]=4;
		input[2]=8;
		input[3]=6;
		input[4]=10;
			int avg=0;
			int sum =0;
			int length = input.length;
			boolean a1 = true;
			
			for(int i=0;i<=input.length-1;i++) {
				sum = sum+input[i];
			}
			System.out.println("sum-->" +sum);
			avg = sum/length;
			for(int i=0;i<=input.length-1;i++)
			{
				if (avg==input[i]) 
				{
					System.out.println("the average of the numbers is present in given array");
					a1=false;
					break;
				}
				//else{
				
					//System.out.println("the avegare of the numbers is not present in given array");
				    //continue;}
				
			}
			if(a1==true) {
				System.out.println("the avegare of the numbers is not present in given array");
	
			}
	}

}
 
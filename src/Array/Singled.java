package Array;

public class Singled {

	public static void main(String args[]) {
		
	
	 int arr[]={1,4,5,6,8,9,10};
	 
	 int size=arr.length;
	 
	 for(int i=0;i<size;i++) {
		 
		 System.out.println("The index value of " +i+ " is " +arr[i]);
	 }
	 
	 int arr1[][] ={{1,2,3,4}, {3,4,5,7}};
	 
	 //int size1= arr1.length;
	 
	   for(int i=0;i<3;i++) {
		   

		   for(int j=0;j<4;j++) {
			   
			   System.out.print(arr1[i][j]);
		   }
		   	   }
	 
	 
	} 
	 
}

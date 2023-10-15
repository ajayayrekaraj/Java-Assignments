/* Program 5
 * WAP to find a Perfect number from an array and return its index.
 * Take size and elements from the user
 * Input: 10 25 252 496 564
 * Output: Perfect no 496 found at index: 3 */
import java.util.*;
class Demo{                                                                                                                                                                                                       
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter size");
        int size=sc.nextInt();
	    System.out.print("Enter array elements");
             int arr[]=new int[size];
               for(int i=0;i<arr.length;i++){
		       arr[i]=sc.nextInt();
	       }
   
	     for(int i=0;i<arr.length;i++){
	         int sum=0; 			
	          for(int j=1;j<arr[i];j++){	
			  if( arr[i]%j==0){  				
				  sum=sum+j;	
			  }
		  }	
		        if(sum==arr[i]){
				System.out.print("perfect number "+arr[i]+" found at index "+i+" ");	
			}
		  System.out.println();
	     }
}
}

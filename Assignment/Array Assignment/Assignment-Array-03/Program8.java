/* Program 8
 * WAP to find an ArmStong number from an array and return its index.
 * Take size and elements from the user
 * Input: 10 25 252 36 153 55 89
 * Output: Armstrong no 153 found at index: 4 */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		System.out.println("Enter array Elements:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
 		for(int i=0;i<arr.length;i++){
  			int temp=arr[i];
  			int count=0;
			int sum=0;
    			while(temp!=0){
       				count++;
       				temp=temp/10;      
 			}
 			int temp1=arr[i];
			while(temp1!=0){
       				int mul=1;
			int rem=temp1%10;
			for(int j=1;j<=count;j++){					
  				mul=mul*rem;	
			}					
			sum=sum+mul;			
     			temp1=temp1/10;
	    		}
	     		if(sum==arr[i]){		
		    		System.out.print("Armstrong no "+arr[i]+" found at index :"+i+" ");
	               }              
	      	}
	}
}	

/* Program 7
 *  * WAP to find a Strong number from an array and return its index.
 *   * Take size and elements from the user
 *    * Input: 10 25 252 36 564 145
 *     * Output: Strong no 145 found at index: 5 */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int size=sc.nextInt();						
		System.out.println("Enter array elements:");												int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int sum=0;
			while(temp!=0){ 
				int fact=1;	      
				int rem=temp%10;			
				for(int j=1;j<=rem;j++){
					fact=fact*j;		
				}	
				sum=sum+fact; 
				temp=temp/10;	
			} 																											   			   if(sum==arr[i]){
				System.out.print("strong no "+arr[i]+" found at index "+i+" "); 
			}	
		}	
	}
}


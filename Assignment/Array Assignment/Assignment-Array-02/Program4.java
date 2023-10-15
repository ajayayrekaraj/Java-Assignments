/* Program 4
  WAP to search a specific element from an array and return its index.
  Input: 1 2 4 5 6
  Enter element to search: 4
  Output: element found at index: 2 */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		 System.out.println("Enter Elements to search:");
		int search=sc.nextInt(); 
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				System.out.print("element found at index: "+i);
				break;
		}
		else{
			System.out.println("Not found");
		}
	}
	System.out.println();
    }
}

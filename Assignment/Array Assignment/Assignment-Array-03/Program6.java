/* Program 6
 * WAP to find a palindrome number from an array and return its index.
 * Take size and elements from the user
 * Input: 10 25 252 36 564
 * Output: Palindrome no 252 found at index: 2 */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int rev=0;
			while(temp!=0){
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev==arr[i]){
				System.out.println("palindrome no "+arr[i]+" found at index: "+i+" ");
			}
		}
	}
}

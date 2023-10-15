/* Program 2
 * WAP to reverse each element in an array.
 * Take size and elements from the user
 * Input: 10 25 252 36 564
 * Output: 01 52 252 63 465  */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
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
			System.out.print(" "+rev);
		}
		System.out.println();
	}
}

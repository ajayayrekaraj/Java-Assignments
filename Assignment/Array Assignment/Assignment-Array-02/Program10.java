/* Program 10
 * WAP to print the elements whose addition of digits is even.
 * Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
 * Input :
 * Enter array : 1 2 3 5 15 16 14 28 17 29 123
 * Output: 2 15 28 17 123 */
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
		System.out.println("Even number is:");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			int temp=arr[i];
			while(temp!=0){
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);

			}

			}
		}
	}

 

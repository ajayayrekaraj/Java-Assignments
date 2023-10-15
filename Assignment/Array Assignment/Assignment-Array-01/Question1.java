/* Program 1
  WAP to take size of array from user and also take integer elements from user Print sum
  of odd elements only
  input : Enter size : 5
  Enter array elements : 1 2 3 4 5
  output : 9
   1 + 3 + 5 */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of odd numbers is "+sum);
	}
}


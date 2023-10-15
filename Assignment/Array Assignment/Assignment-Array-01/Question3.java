/* Program 3
  WAP to take size of array from user and also take integer elements from user Print
  product of odd index only
  input : Enter size : 6
  Enter array elements : 1 2 3 4 5 6
  output : 48
   2 * 4 * 6  */
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
		int mul=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
			mul=mul*arr[i];
		}
		}
		System.out.println("Multiplication of odd numbers is "+mul);
	}
}


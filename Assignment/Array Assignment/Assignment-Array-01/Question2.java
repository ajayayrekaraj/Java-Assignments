/* Program 2
  WAP to take size of array from user and also take integer elements from user Print
  product of even elements only
  input : Enter size : 9
  Enter array elements : 1 2 3 2 5 10 55 77 99
  output : 40
   2 * 2 * 10  */

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size :");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int mul=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				mul=mul*arr[i];
			}
		}
		System.out.println("Multiplication is "+mul);
	}
}

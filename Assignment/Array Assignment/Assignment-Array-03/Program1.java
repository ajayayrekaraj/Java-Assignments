/* Program 1
   Write a program to print count of digits in elements of array.
   Input: Enter array elements : 02 255 2 1554
   Output: 2 3 1 4 */

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Count is:");
		for(int i=0;i<arr.length;i++){
			int count=0;
			while( arr[i]>0){
				arr[i]=arr[i]/10;
				count++;
			}
			System.out.println(count);
		}
	}
}



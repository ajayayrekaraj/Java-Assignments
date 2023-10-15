/* Program 6
 * WAP to take size of array from user and also take integer elements from user
 * find the maximum element from the array
 * input : Enter size : 5
 * Enter array elements: 1 2 5 0 4
 * output: max element = 5  */

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("Max Elements is "+max);
	}
}

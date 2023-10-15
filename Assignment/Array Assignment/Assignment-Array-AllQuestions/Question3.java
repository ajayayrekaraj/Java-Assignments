/* 3. Program 3:
  Write a program to create an array of ‘n’ integer elements.
  Where ‘n’ value should be taken from the user.
  Insert the values from users and print accordingly
  Input:
  n=5
  Enter elements in the array :
  1
  2
  3
  4
  5
  Output:
  1
  2
  3
  4
  5  */

import java.util.*;
class Question3{
	public static void main(String[]args){
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=aa.nextInt();
		System.out.println("Enter array Elements:");
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=aa.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
}


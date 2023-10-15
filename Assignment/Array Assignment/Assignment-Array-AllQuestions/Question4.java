/* 4. Program 4:
  Write a program to create an array of ‘n’ integer elements.
  Where ‘n’ value should be taken from the user.
  Insert the values from users and print even numbers from the array.
  Input:
  n=5
  Enter elements in the array:
  1
  2
  3
  4
  5
  Output:
  2
  4  */

import java.util.*;
class Question4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of an array:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print( arr[i] + " ");
			}
			else{

			}
		}
		System.out.println("\n");
	}
}


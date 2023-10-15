/* 2. Program 2:
  Write a program to create an array of 5 integer elements.
  Insert from the user and print 5 elements from an array
  Input:
  1
  2
  3
  4
  5
  Output :
  1
  2
  3
  4
  5  */

import java.util.*;
class Question2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
	        int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
}



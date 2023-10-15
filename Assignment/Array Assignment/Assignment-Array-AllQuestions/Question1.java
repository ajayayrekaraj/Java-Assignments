/* 1. Program 1:
  Write a program to create an array of 5 integer elements.
  And print all 5 elements from an array (take hardcoded values in the array)
  Output :
  1
  2
  3
  4
  5  */
import java.util.*;
class Question1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();

		System.out.println("Enter array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " " );
		}
		System.out.println("\n");
	}
}



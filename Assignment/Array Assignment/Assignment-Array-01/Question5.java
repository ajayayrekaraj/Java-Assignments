/* Program 5
 * Write a program ,take 10 input from the user and print only elements that are divisible by
 * 5.
 * Input: 10 2 2 3 3 3 4 4 25 55
 * Output: 10 25 55  */

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size:");
		int size=sc.nextInt();

		System.out.println("Enter numbers:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.print(" " +arr[i]);
			}
			
		}
	}
}

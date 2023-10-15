/* Program 4
  Write a program, take 7 characters as an input , Print only vowels from the array
  Input: a b c o d p e
  Output : a o e  */

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of characters:");
		int size=sc.nextInt();

		System.out.println("enter characters :");
		char arr[]=new char[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u' ){
				System.out.print(" "+arr[i]);
			}
		}
	}
}

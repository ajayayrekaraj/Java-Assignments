/* Program 3
  Write a Java program to find the sum of even and odd numbers in an array.
  Display the sum value.
  Input: 11 12 13 14 15
  Output
  Odd numbers sum = 39
  Even numbers sum = 26 */
 import java.util.*;
 class Demo{
	 public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter size:");
		 int size=sc.nextInt();
		 System.out.println("Enter Array Elements:");
		 int arr[]=new int[size];

		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		 int EvenSum=0;
		 int OddSum=0;
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]%2==0){
				 EvenSum=EvenSum+arr[i];
			 }
			 else{
				 OddSum=OddSum+arr[i];
			 }
		 }
		 System.out.println("Odd Numbers sum = "+OddSum);
		  System.out.println("Even Numbers sum = "+EvenSum);
	 }
 }

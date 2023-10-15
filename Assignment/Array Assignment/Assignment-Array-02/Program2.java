/* Program 2
  WAP to find the number of even and odd integers in a given array of integers
  Input: 1 2 5 4 6 7 8
  Output:
  Number of Even Elements: 4
  Number of Odd Elements : 3  */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers in array:");
		int n=sc.nextInt();
		System.out.println("Enter array Elements:");
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count1++;
			}
			else{
				count2++;
			}
		}
		System.out.println("Number of Even Elements:" +count1);
		System.out.println("Number of Odd Elements:" +count2);
	}
}

/*Program 9
Write a program to print the second max element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 255 */


import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size=sc.nextInt();
		System.out.println("Enter array Elements:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		if(size>2){
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		else{
			System.out.println("You Entered of " +size);
		}
		System.out.println("Second maximun num " +arr[arr.length-2]);
	}
}


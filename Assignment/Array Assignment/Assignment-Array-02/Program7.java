/* Program 7
 * WAP to find the common elements between two arrays.
 * Input :
 * Enter first array : 1 2 3 5
 * Enter Second array: 2 1 9 8
 * Output: Common elements :
 * 1
 * 2 */

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size1:");
		int size1=sc.nextInt();
		System.out.println("Enter size2:");
		int size2=sc.nextInt();

		System.out.println("Enter first array elements:");
		int arr1[]=new int[size1];

		for(int i=0;i<arr1.length;i++){
			  arr1[i]=sc.nextInt();
		}

		  System.out.println("Enter second array elements:");   
		  int arr2[]=new int[size2]; 

		for(int j=0;j<arr2.length;j++){
			  arr2[j]=sc.nextInt();
		}
               System.out.println("Common elements :");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
			if(arr1[i]==arr2[j]){
				System.out.println(" "+arr1[i]);
			}
		}
	}
}
}
			
		


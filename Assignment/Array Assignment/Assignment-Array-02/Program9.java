/* Program 9
 * Write a Java program to merge two given arrays.
 * Array1 = [10, 20, 30, 40, 50]
 * Array2 = [9, 18, 27, 36, 45]
 * Output :
 * Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
 * Hint: you can take 3rd array */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size1:");
		int size1=sc.nextInt();
		System.out.println("Enter size2:");
		int size2=sc.nextInt();

		System.out.println("Enter array1:");
		int arr1[]=new int[size1];

		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter Array2:");
		int arr2[]=new int[size2];

		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}

		int arr3[]=new int[size1+size2];
		 for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		} 
		for(int i=0;i<arr2.length;i++){
			arr3[size1+i]=arr2[i];
		 }
		System.out.println("Merged Array is");
		for(int i=0;i<arr3.length;i++){
		 System.out.println(arr3[i]);
		}
	}

}



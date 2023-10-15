/* 4. Time to equality
 * Problem Description
 * - Given an integer array A of size N.
 *   - In one second, you can increase the value of one element by 1.
 *   - Find the minimum time in seconds to make all elements of the array
 *   equal.
 *   Problem Constraints
 *   1 <= N <= 1000000
 *   1 <= A[i] <= 1000
 *   Example Input
 *   A = [2, 4, 1, 3, 2]
 *   Example Output
 *   8
 *   Example Explanation
 *   We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8
 *   seconds. */
import java.util.*;
class Demo{
	public static int minTimeToEquality(int[] A) {
		        int maxElement = Integer.MIN_VALUE;
			        int N = A.length;
				
			        for (int i = 0; i < N; i++) {
					   if (A[i] > maxElement) {
					         maxElement = A[i];
					    }                         
			      	}	                                   
			         int totalTime = 0;
				 for (int i = 0; i < N i++) {
					 totalTime += maxElement - A[i];
				 }
					 return totalTime;					                                                                                                                }
				                                                                                                                 }                                                                                                                                                        
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array size:");
		int N=sc.nextInt();

		int arr[]=new int[N];

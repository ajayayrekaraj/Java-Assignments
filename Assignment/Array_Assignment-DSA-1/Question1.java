/* Q1. Max Min of an Array
 * Problem Description
 * - Given an array A of size N.
 *   - You need to find the sum of the Maximum and Minimum
 *   elements in the given array.
 *   Problem Constraints
 *   1 <= N <= 105
 *   -109 <= A[i] <= 109
 *   Example Input
 *   Input 1:
 *   A = [-2, 1, -4, 5, 3]
 *   Input 2:
 *   A = [1, 3, 4, 1]
 *   Example Output
 *   Output 1:
 *   1
 *   Output 2:
 *   5
 *   Example Explanation
 *   Explanation 1:
 *   Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
 *   Explanation 2:
 *   Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.     */
import java.util.*;
class Max_Min{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of elements:");
		int N=sc.nextInt();
                
                System.out.println("Enter elements in array:");
		int arr[]=new int[N];
		int maxEle=Integer.MIN_VALUE;
		int minEle=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
		         arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]>maxEle){
				maxEle=arr[i];
			}
		}

		for(int j=0;j<arr.length;j++){
			if(arr[j]<minEle){
				minEle=arr[j];
			}
		}
		int result=maxEle+minEle;
		System.out.println("Maximum element is   " +maxEle+ "  and Minimum element is  "  +minEle+  " Output: "  +result);
	}
}



				

/* Q2. Linear Search - Multiple Occurences
 * Problem Description
 * Given an array A and an integer B, find the number of occurrences
 * of B in A.
 * Problem Constraints
 * 1 <= B, Ai <= 109
 * 1 <= length(A) <= 1050
 * Example Input
 * Input 1:
 * A = [1, 2, 2], B = 2
 * Input 2:
 * A = [1, 2, 1], B = 3
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 0
 * Example Explanation
 * Explanation 1:
 * Element at index 2, 3 is equal to 2 hence count is 2.
 * Explanation 2:
 * There is no element equal to 3 in the array.  */
import java.util.*;
class Multi{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();

		int count=0;
                System.out.println("Enter Array Elements:");  
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Occurances of element:");
		int B=sc.nextInt();

		for(int i=0;i<arr.length;i++){
			if(arr[i]==B){
				count++;
			}
		}
		System.out.println("Output:"+count);
	}
}




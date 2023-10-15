/*5. Take no of rows from the user
  ROWS = 4
  4 4 4 4
  3 3 3 3
  2 2 2 2
  1 1 1 1  */

import java.util.*;
class Demo5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter rows:");
		int row=sc.nextInt();

		for(int i=row;i>=1;i--){
			for(int j=1;j<=row;j++){
				System.out.print(" "+i);	
			}
			System.out.println();
		}
	}
}


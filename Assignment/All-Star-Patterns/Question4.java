/* 4. Take no of rows from the user
 ROWS = 3
  1 1 1
  2 2 2
  3 3 3  */

import java.util.*;
class Demo4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter rows:");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}


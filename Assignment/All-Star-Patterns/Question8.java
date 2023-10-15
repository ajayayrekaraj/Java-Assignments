/* 8.Take no of rows from the user
   ROWS = 3
   1 3 5
   7 9 11
   13 15 17  */

import java.util.*;
class Demo8{
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);

		System.out.print("Enter rows:");
		int row=a.nextInt();
		int col=a.nextInt();
		System.out.print("Enter Start Number:");

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.println(" "+i+1-1);
			}
			System.out.println();
		}
	}
}


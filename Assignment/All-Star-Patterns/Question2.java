/* 2. Take no of rows & cols from the user
  ROWS = 3
  Col = 4
  1 2 3 4
  5 6 7 8
  9 10 11 12  */

import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter rows=");
		int row=sc.nextInt();
		System.out.print("Enter Column=");
		int col=sc.nextInt();
               int k=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print(" "+k);
				k++;
			}
			System.out.println();
		}
	}
}



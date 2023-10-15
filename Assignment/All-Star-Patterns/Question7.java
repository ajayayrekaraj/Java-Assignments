/* 7. Take no of rows from the user
  ROWS = 3
  A A A
  B B B
  C C C  */

import java.util.*;
class Demo7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter rows:");
		int row=sc.nextInt();

		char ch=65;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print((char) ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}


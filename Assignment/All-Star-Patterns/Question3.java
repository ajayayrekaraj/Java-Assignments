/* 3. Take no of rows from the user
 ROWS = 3
 a b c
 d e f
 g h i  */

import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter rows=");
		int row=sc.nextInt();
		System.out.print("Enter Column=");
		int col=sc.nextInt();
                
	        int ch=97;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print((char) ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}



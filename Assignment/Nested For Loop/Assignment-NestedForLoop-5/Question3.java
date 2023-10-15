/*Q3
write a program to print the following pattern
5 4 3 2 1
8 6 4 2
9 6 3
8 4
5
USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take the number of rows from user
for(int i =1;i<=row;i++) */

import java.io.*;
class Pattern1{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row");
		int row=Integer.parseInt(br.readLine());
		int num1=row;
		for(int i=1;i<=row;i++){
			int num=num1;
			for(int j=1;j<=row-i+1;j++){
				System.out.print(" "+(num*i)+" ");
				num--;
			}
		       num1--;
			System.out.println(" ");
		}
		System.out.println( );
	}
}


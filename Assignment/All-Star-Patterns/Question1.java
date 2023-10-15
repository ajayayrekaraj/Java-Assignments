/* 1. Take no of rows from the user
 ROWS = 3
 * * * *
 * * * *
 * * * *  */
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row=");
		int row=sc.nextInt();
		System.out.println("Enter Column=");
		int col=sc.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

		

/* 6. Take no of rows from the user
  ROWS = 3
  9 8 7
  6 5 4
  3 2 1  */
import java.util.*;
class Demo6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter rows:");
		int row=sc.nextInt();

		System.out.print("Enter end number:");
		int end=sc.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(" "+end);
				end--;
			}
			System.out.println();
		}
	}
}



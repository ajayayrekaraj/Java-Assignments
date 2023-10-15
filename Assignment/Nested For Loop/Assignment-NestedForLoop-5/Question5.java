/* Q5
  write a program to print the following pattern
  Row =4
  0
  1 1
  2 3 5
  8 13 21 34
  USE THIS FOR LOOP STRICTLY for the outer loop
  Int row;
  Take the number of rows from user
  for(int i =1;i<=row;i++){
  }
  */
import java.io.*;
class Fibnossis{
	public static void main(String[]args) throws IOException{
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row=Integer.parseInt(br.readLine());

		int num1=0;
		int num2=1;
		int num3=0;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+num1);
				num3=num1+num2;
				num2=num1;
				num1=num3;
			}
			System.out.println();
		}
	}
}


/* Q1
  write a program to print the following pattern
  D4 C3 B2 A1
  A1 B2 C3 D4
  D4 C3 B2 A1
  A1 B2 C3 D4
  USE THIS FOR LOOP STRICTLY for the outer loop
  Int row;
  Take the number of rows from user
  for(int i =1;i<=row;i++){
  } */
import java.io.*;
class Demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row");
		int row=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){

			if(i%2!=0){
				System.out.print((char)(65+row-j));
				System.out.print(row-j+1);
			}
			else{
				System.out.print((char)(64+j));
				System.out.print(j);
			}
			System.out.print(" ");
			}
			System.out.println( );
	}
}
}

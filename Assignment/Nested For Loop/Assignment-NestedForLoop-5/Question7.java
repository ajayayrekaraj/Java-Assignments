/* Q7
 * write a program to print the following pattern
 * Row =5;
 * O
 * 14 13
 * L K J
 * 9 8 7 6
 * E D C B A
 * Row = 4
 * 10
 * I H
 * 7 6 5
 * D C B A
 * USE THIS FOR LOOP STRICTLY for the outer loop
 * Int row;
 * Take row from user
 * for(int i =1;i<=row;i++){
 * }  */
import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row:");
		int row=Integer.parseInt(br.readLine());

		int x=(row*(row+1))/2;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if((i%2==1 && row%2==1) || (i%2==0  && row%2==0)){
				       System.out.print((char)(64+x)+" ");
				}
				else {
		                 	System.out.print(x+" ");
				}
		               x--;
			}
	System.out.println();
		}
	}
}	

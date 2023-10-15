/* Q3
  Write a program to take a range as input from the user and print perfect squares between that range.
  Input: Enter start: 1
  Enter end: 100
  Output: perfect squares between 1 and 100 */
import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter start number:");
		int start=Integer.parseInt(br.readLine());
		System.out.print("Enter end number:");
		int end=Integer.parseInt(br.readLine());

                System.out.println("perfect squares between "+start+" and "+end+" ");
		for(int i=start;i<=end;i++){
			for(int j=1;j<=i;j++){
				if(j*j==i){
					System.out.print(" "+i);
				}
			}
		}
		System.out.println();
	}
}

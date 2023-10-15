/* Q10
  Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
  end number from a user )
  Input: Enter start: 1
  Enter end: 1650
  Output: Armstrong numbers between 1 and 1650
  1 2 3 4 5 6 7 8 9 153 370 371 407 1634      */
import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter start number:");
		int start=Integer.parseInt(br.readLine());
		System.out.print("Enter end number:");   
		int end=Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
			int temp=i;
			int count=0;
			int sum=0;
			while(temp!=0){
				count++;
				temp=temp/10;
			}
			int temp1=i;
			while(temp1!=0){
				int mul=1;
				int rem=temp1%10;
				for(int j=1;j<=count;j++){
					mul=mul*rem;
				}
				sum=sum+mul;
				temp1=temp1/10;
			}
			if(sum==i){
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
}

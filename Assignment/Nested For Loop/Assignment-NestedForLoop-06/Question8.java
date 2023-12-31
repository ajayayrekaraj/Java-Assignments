/* Q8
  Write a program to take range as input from the user and print Palindrome numbers. ( Take a start and
  end number from a user )
  Input: Enter start: 100
  Enter end: 250
  Output: Palindrome numbers between 100 and 250
  101 111 121 131 141 151 161 171 181 191 202 212 222 */
import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter start number:");
		int start=Integer.parseInt(br.readLine());
		System.out.print("Enter end number:");
		int end=Integer.parseInt(br.readLine());
                
		System.out.println("Palindrome numbers between "+start+" and "+end+" ");
		for(int i=start;i<=end;i++){
			int temp=i;
			int rev=0;
			while(temp!=0){
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev==i){
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
}


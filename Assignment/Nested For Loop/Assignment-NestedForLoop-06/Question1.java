/* Q1
  Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
  count of even numbers.
  Input: Enter a lower limit: 1
  Enter upper limit: 50
  Output: 10, 20, 30, 40, 50
  Count = 5  */
import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a lower limit: ");
		int lowerlimit=Integer.parseInt(br.readLine());
		System.out.print("Enter upper limit: ");
		int upperlimit=Integer.parseInt(br.readLine());

                 int count=0;
		for(int i=lowerlimit;i<=upperlimit;i++){

			if(i%5==0){
				count++;
				System.out.print(" "+i);
			}
		}
		System.out.println( );
		System.out.println("count= "+count);
	}
}


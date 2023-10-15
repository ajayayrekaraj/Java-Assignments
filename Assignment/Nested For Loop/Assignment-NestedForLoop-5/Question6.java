/* Q6
  Write a program, and take two characters if these characters are equal then print them as it is but if
  they are unequal then print their difference.
  {Note: Consider Positional Difference Not ASCIIs}
  Input: a p
  Output: The difference between a and p is 15  */

import java.io.*;
class Difference{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first character: ");
		 char ch=(char)br.read(); 
		 System.out.println("Enter Second Character: "); 
		char ch1=(char)br1.read();

		if((char)ch==(char)ch1){
			System.out.print("characters are equal");
		}
		else{
			int diff=ch1-ch;
			System.out.print("Difference between "+ch+" and"+ch1+"  is"+" "+diff );
		}
	}
}


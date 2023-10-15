/*
 * claculate factorial of 6
   Output:factorial is 720
  */

class Question2{
	public static void main(String[]args){
		int i=1;
		int fact=1;
		int n=6;

		while(i<=n){
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}

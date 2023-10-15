/* Question 1:
   Write a java program to check if a number is even or oddd.
   Input= var=10;
   Output=10 is an even number
   Input= var=37;
   Output=37 is an odd number
   Input= var=0;
   Output= 0 is an Neutral number */

class Question1{
	public static void main(String[]args){
		int x=0;

		if(x==0){
			System.out.println(+x+ " is an Neutral number");
		}
		else if(x%2==0){
			System.out.println(+x+ " is an even number");}
		else if(x%2==1){
			System.out.println(+x+ " is an odd number");
		}
	}
}



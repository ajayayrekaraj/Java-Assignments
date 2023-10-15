/* Write a java program take a number and print whether it is less than greater than 10.
   Input1:var=5;
   Output:5 is less than 10;
   Input2:var=16;
   Output:16 is greater than 10;
   Input:var=10;
   Output:10 is equal to 10; */

class Question2{
	public static void main(String[]args){
	int x=9;

	if(x<10){
		System.out.println(+x+" is less than 10");
	}
	else if(x>10){
		System.out.println(+x+"  is greater than 10");
	}
	else if(x==10){
		System.out.println(+x+"  is equal to 10");
	}
}
}

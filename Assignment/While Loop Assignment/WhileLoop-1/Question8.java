/*Write a program to print the countdown of days to submit the assignment
  Input day=7;
  Output= 7 days remaining;
           -
	   -
	  1 days remaining
	  0 days assignment is overdue
  */

class Question8{
	public static void main(String[]args){
	int i=7;

	while(i>0){
		System.out.println(+i+ " days remaining");
		i--;
	}
	if(i==0){
		System.out.println(+i+ " days assignment is overdue");
	}
}
}



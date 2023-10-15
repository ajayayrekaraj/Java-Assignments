/*Write a program in java to accept three numbers and checks and check 
  whether they are pythagorean triplets or not
  example (what is a pythagorean triplet)
  a=3,b=4,c=5
  if
  a*a+b*b=c*c
  then 
  its pythagorean triplet
  else
  not a pythagorean triplet
  
  Input1:
  a=3,b=4,c=5
  Output:it is a pythagorean triplet
 
  Input2:
  a=1,b=6,c=9
  Output:it is not a pythagorean triplet
 
  Input3:
  a=2,b=2,c=2
  Output:it is not a pythagorean triplet */

class Question9{
	public static void main(String[]args){
		double a=2;
		double b=2;
		double c=2;

		if((a*a+b*b)==c*c){
			System.out.println("Its pythagorean triplet");
        	}
		else if((a*a+c*c)==b*b){
			System.out.println("Its pythagorean triplet");
		}
		else if((b*b+c*c)==a*a){
			System.out.println("Its pythagorean triplet");
		}
                else{                                                                                                                                 System.out.println("Its not a pythagorean triplet");                                                                  }                                                           
                }
}




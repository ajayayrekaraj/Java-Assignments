   /*
  Input1:
   num1=1;
   num2=2;
   num3=3;
   Output:3 is the maximum between 1,2 and 3

    Input2:
    num1=1;
    num2=4;
    num3=3; 
    Output:4 is the maximum between 1,4 and 3  

     Input3:
     num1=42;
     num2=32;
     num3=42;
    Output:num1 and num3 are greater than num2 

 */

class Question6{
	public static void main(String[]args){
		double num1=42;
		double num2=32;
		double num3=42;

		if(num1>num2 && num1>num3){
			System.out.println(+num1+" is the maximum between 1,2 and 3");
		}
		else if(num2>num3 && num2>num1){
			System.out.println(+num2+" is the maximum between 1,2 and 3");
		}
		else if(num3>num1 && num3>num2){
			System.out.println(+num3+" is the maximum between 1,2 and 3");
		}
       	      else if((num1==num2)&&(num1>num3)){
			System.out.println(+num1+"and" +num2+" are greater than num3 ");
		}
               else if ((num1==num3)&&(num2>num3)){
		       System.out.println(+num1+"and" +num3+" are greater than num2");
	       }
	       else if((num2==num3)&&(num1>num2)){
		       System.out.println(+num2+"and"+num3+" are greater than num1");
	       }
	}
}



	 




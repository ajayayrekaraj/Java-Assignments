/* Write a java program that checks a number from   o to 5 an d print the spelling if the number i   s greater than 5 print the number is greater t   han 5.
   Input1:var=4;
   Output:Four;
   Input2:var=6;
   Output:number is greater than 5;
   Input:var=-1;
   Output:Invalid; */

class Question4{
	public static void main(String[]args){
		int num=9;

		if(num>5){
			System.out.println(+num+" is greater than 5");
		}
		else if(num==0){
			System.out.println("Zero");
		}
		else if(num==1){                                      
			System.out.println("One");
		}
		 else if(num==2){                                                                                                                               System.out.println("Two");                                                                                                     }            
		  else if(num==3){      
			  System.out.println("Three");                                                                                                     }            
		   else if(num==4){                
			   System.out.println("Four");
		   } 
	         else if(num==5){
	                   System.out.println("Five");
		 }
		else{
		       System.out.println("Invalid");
		}
	}
}	

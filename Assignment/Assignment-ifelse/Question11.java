/* else if ladder real time example
   data: marks between 91 to 100 give grade A+
         marks between 81 to 90  give grade A
	 marks between 71 to 80  give grade B+
	 marks between 61 to 70  give grade B
	 marks between 51 to 60  give grade c+
	 marks between 41 t0 50  give grade c
	 marks below 40 is fail
	 marks is exactly 40 then pass  */

class Question11{
	public static void main(String[]args){
		int N=99;
		if(N>=91 && N<=100){
			System.out.println("A+");
		}
		else if(N>=81 && N<=90){
			System.out.println("A");
		}
		else if(N>=71 && N<=80){
			System.out.println("B+");
		}
		else if(N>=61 && N<=70){
			System.out.println("B");
		}
		else if(N>=51 && N<=60){
			System.out.println("C+");
		}
		else if(N>=41 && N<=50){
			System.out.println("C");
		}
		else if(N==40){
		System.out.println("Pass");
		}
		else if(N<40){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
	


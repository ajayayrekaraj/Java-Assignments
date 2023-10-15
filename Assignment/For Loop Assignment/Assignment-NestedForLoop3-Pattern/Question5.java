/* 10 10 10 10
   11 11 11
   12 12 
   13    */

class Question5{
	public static void main(String[]args){
		int row=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i+1;j++){
				System.out.print(9+i+ " ");
			}
			System.out.println( );
		}
	}
}


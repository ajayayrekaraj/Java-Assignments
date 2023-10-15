/* 1 2 3 4
   2 3 4
   3 4
   4   */

class Question4{
	public static void main(String[]args){
		int row=4;
		for(int i=1;i<=row;i++){
			int temp=i;
			for(int j=1;j<=row-i+1;j++){
				System.out.print(temp+ " ");
				temp++;
			}
			System.out.println( );
		}
	}
}



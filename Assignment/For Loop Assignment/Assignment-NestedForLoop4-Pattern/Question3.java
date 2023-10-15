/* 10
   10 9
    9 8 7
    7 6 5 4  */

class Question3{
	public static void main(String[]args){
		int row=4;
		int num=10;
		int rev;
			for(int i=1;i<=row;i++){
				 rev=num;
				for(int j=1;j<=i;j++){
					System.out.print(rev+ " ");
					rev--;
				}
				num--;
				System.out.println( );
			}
	}
}


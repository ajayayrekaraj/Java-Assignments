/* 1 2 3 4
   2 3 4
   3 4
   4  */

class Question10{
	public static void main(String[]args){
		int row=4;
		for(int i=1;i<=row;i++){
			int num=i;
			for(int j=1;j<=row-i+1;j++){
				System.out.print(num+ " ");
				num++;
			}
			System.out.println( );
		}
	}
}


/* 1 
   3 4 
   6 7 8
   10 11 12 13
   15 16 17 18 19 */

class Question2{
	public static void main(String[]args){
		int row=5;
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+ " ");
				num++;
			}
			num++;
			System.out.println();
		}
	}
}

